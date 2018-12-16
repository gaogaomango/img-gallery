package jp.co.mo.imggallery

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView by Delegates.notNull()
    private var imageGalleryAdapter: ImageGalleryAdapter by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvImages)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, SPLIT_NUMBER)
        imageGalleryAdapter = ImageGalleryAdapter(this, Photo.getDefaultPhotos())


    }

    override fun onStart() {
        super.onStart()
        recyclerView.adapter = imageGalleryAdapter
    }

    companion object {
        const val SPLIT_NUMBER = 2
    }

    private inner class ImageGalleryAdapter(val context: Context, val photos: Array<Photo>)
        : RecyclerView.Adapter<ImageGalleryAdapter.MyViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val infrater = LayoutInflater.from(context)
            val photoView: View = infrater.inflate(R.layout.item_image, parent, false)
            return MyViewHolder(photoView)
        }

        override fun getItemCount(): Int {
            return photos.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            Picasso.get()
                    .load(photos[position].url)
                    .placeholder(R.drawable.loading)
                    .error(R.drawable.prohibit)
                    .fit()
                    .into(holder.photoImageView)

        }


        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val photoImageView: ImageView = itemView.findViewById(R.id.ivPhoto)

            init {
                itemView.setOnClickListener({
                    val position = adapterPosition
                    if (position != RecyclerView.NO_POSITION) {
                        val intent: Intent = Intent(context, PhotoDetailActivity::class.java)
                        intent.putExtra(PhotoDetailActivity.EXTRA_KEY_PHOTO, photos[position])
                        startActivity(intent)
                    }
                })
            }
        }
    }
}
