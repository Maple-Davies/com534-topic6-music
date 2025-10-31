class Album(val songs: List<Song>) : Music {

    fun findSongsByArtist(searchArtist: String): List<Song> {
        return songs.filter{ it.artist == searchArtist }
    }

    override fun getPlayingTime(): Double {
        var totalTime = 0.0
        for (song in songs) {
            totalTime += song.playingTime
        }
        return totalTime
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }
}