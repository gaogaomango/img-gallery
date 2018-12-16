package jp.co.mo.imggallery

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Photo(val url: String) : Parcelable {
    companion object {
        fun getDefaultPhotos(): Array<Photo> {
            return arrayOf<Photo>(Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"),
                    Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"),
                    Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"),
                    Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"),
                    Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"),
                    Photo("https://goo.gl/32YN2B"),
                    Photo("https://goo.gl/Wqz4Ev"),
                    Photo("https://goo.gl/U7XXdF"),
                    Photo("https://goo.gl/ghVPFq"),
                    Photo("https://goo.gl/qEaCWe"),
                    Photo("https://goo.gl/vutGmM"))
        }
    }
}