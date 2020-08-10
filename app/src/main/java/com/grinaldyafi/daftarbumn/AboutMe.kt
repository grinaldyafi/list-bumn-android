package com.grinaldyafi.daftarbumn



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutMe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about2)
        val actionbar = supportActionBar
        actionbar!!.title = "About Me"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgMe2: ImageView = findViewById(R.id.img_item_photo2)


        val url2 = "https://d17ivq9b7rppb3.cloudfront.net/small/avatar/20200710133912df2823f6bdd7ffd92e4d6e82b7d6f289.png"

        Glide.with(this)
            .load(url2)
            .apply(RequestOptions())
            .into(imgMe2)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}