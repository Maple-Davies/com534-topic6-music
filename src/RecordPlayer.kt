class RecordPlayer (music: Music){
    fun play (music: Music):String {
        return "All songs:\n${music.getAllSongs()}\nPlaying time:\n${music.getPlayingTime()}"
    }
}