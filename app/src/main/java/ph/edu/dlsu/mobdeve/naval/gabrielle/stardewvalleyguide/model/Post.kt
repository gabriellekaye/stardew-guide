package ph.edu.dlsu.mobdeve.naval.gabrielle.stardewvalleyguide.model

class Post {
    lateinit var name: String
    lateinit var username: String
    lateinit var dateTime: String
    lateinit var text: String
    var show = true
    var replies = HashMap<String,Reply>()
}