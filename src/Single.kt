class Single(val aSide: Song, val bSide: Song) : Music{
    override fun getPlayingTime(): Double {
        var totalTime = aSide.playingTime + bSide.playingTime
        return totalTime
    }

    override fun getAllSongs(): List<Song> {
        return listOf(aSide, bSide)
        var songList = mutableListOf<Song>()
        songList.add(aSide)
        songList.add(bSide)
        return songList
    }
}