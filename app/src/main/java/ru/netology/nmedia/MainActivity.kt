package ru.netology.nmedia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import ru.netology.nmedia.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        like.setOnClickListener {
            like.setImageResource(R.drawable.ic_baseline_liked_24)
        }

        val post = Post(
            1,
            "Нетология. Университет интернет-профессий будущего",
            "Привет, это новая Нетология! Когда-то Нетолония начиналась с интенсивов по онлайн-маркетингу. Затем появились курсыпо дизайну, разработке, аналитике и управлению. Мы растем сами и помогаемрасти студентам от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия - помочь встать на путь роста и начать цепочку перемен -> http://netolo.gy/fyb",
            "21 мая 18:36",
            false,
            0,
            0,
            0
        )
        binding.author.text = post.author

        with(binding) {
            author.text = post.author
            content.text = post.content
            publishedDate.text = post.publishedDate

            if (post.likeByMe) {
                like.setImageResource(R.drawable.ic_baseline_liked_24)
            } else {
                like?.setImageResource(R.drawable.ic_baseline_favorite_border_24)
            }
        }
    }
}