package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import com.google.android.youtube.player.YouTubePlayerView
import ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.databinding.ActivityVideoTutorialBinding

class VideoTutorialActivity : YouTubeBaseActivity() {
    val VIDEO_ID1 = "hsmfeRzLJdk"
    val VIDEO_ID2 = "Qacv3Syq18E"
    val YOUTUBE_API_KEY = "AIzaSyAgbwNd8g9lhUxPSanyVX_B6_irmg6zhbI"

    private lateinit var  youtubePlayer1: YouTubePlayerView
    private lateinit var  youtubePlayer2: YouTubePlayerView
    private lateinit var btnPlay1 : AppCompatButton
    private lateinit var btnPlay2 : AppCompatButton
    lateinit var  youtubePlayerInit1: YouTubePlayer.OnInitializedListener
    lateinit var  youtubePlayerInit2: YouTubePlayer.OnInitializedListener


    private lateinit var binding: ActivityVideoTutorialBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoTutorialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        youtubePlayer1 = findViewById(R.id.ytp1)
        btnPlay1 = findViewById(R.id.btn_play1)

        youtubePlayerInit1 = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID1)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Snackbar.make(binding.root, "Failed to initialize youtube player", Snackbar.LENGTH_SHORT).show()
            }
        }

        youtubePlayer2 = findViewById(R.id.ytp2)
        btnPlay2 = findViewById(R.id.btn_play2)
        youtubePlayerInit2 = object : YouTubePlayer.OnInitializedListener{
            override fun onInitializationSuccess(
                p0: YouTubePlayer.Provider?,
                p1: YouTubePlayer?,
                p2: Boolean
            ) {
                p1?.loadVideo(VIDEO_ID2)
            }

            override fun onInitializationFailure(
                p0: YouTubePlayer.Provider?,
                p1: YouTubeInitializationResult?
            ) {
                Snackbar.make(binding.root, "Failed to initialize youtube player", Snackbar.LENGTH_SHORT).show()
            }
        }

        btnPlay1.setOnClickListener {
            youtubePlayer1.initialize(YOUTUBE_API_KEY, youtubePlayerInit1)
        }

        btnPlay2.setOnClickListener {
            youtubePlayer2.initialize(YOUTUBE_API_KEY, youtubePlayerInit2)
        }


    }
}