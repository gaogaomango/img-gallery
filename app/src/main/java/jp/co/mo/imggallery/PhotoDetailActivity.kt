package jp.co.mo.imggallery

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import java.lang.Exception
import kotlin.properties.Delegates

class PhotoDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KEY_PHOTO = "KeyOfPhoto"
    }

    private var imageView: ImageView by Delegates.notNull()
    private var photo: Photo by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo_detail)

        photo = intent.getParcelableExtra(EXTRA_KEY_PHOTO)
        imageView = findViewById(R.id.ivPhotoDetail)
    }

    override fun onStart() {
        super.onStart()

        Picasso.get()
                .load(photo.url)
                .placeholder(R.drawable.loading)
                .error(R.drawable.prohibit)
                .fit()
                .centerCrop()
                .noFade()
                .into(imageView, object : Callback {
                    override fun onSuccess() {

                    }

                    override fun onError(e: Exception?) {
                    }
                })
    }



}
