# GDSC_SpotifyClone

This is a clone of Spotify app, but only splash screen, login, home, and page when you clicked on the playlist.
### SPLASH SCREEN
![image](https://github.com/imrismaa/GDSC_SpotifyClone/blob/master/splash_screen.png)

This page has been created using ImageView, TextView, and Button with a constraint layout. But the button which can be clicked is only ```Log in``` button which will navigate to the ```Log in``` page using ```Intent```.

### LOGIN 
![image](https://github.com/imrismaa/GDSC_SpotifyClone/blob/master/login.png)

This page has been created using ImageButton, TextView, and EditText with a constraint layout. But the logic of Log in activity is not implemented yet. When the ```Log in``` or ```Log in without password``` is clicked, the page will navigate to the home page (activity_main.xml) using ```Intent```, and the email or username input value will be saved using
```kotlin
companion object{
    const val EXTRA_USERNAME = "extra_username"
}
```
```kotlin
val emailOrUsernameInput = editTxtEmailOrUsername.text.toString()
val intentToMainActivity = Intent(this@LoginActivity, MainActivity::class.java)
intentToMainActivity.putExtra(EXTRA_USERNAME, emailOrUsernameInput)
```
When the back button is clicked, it will navigate to the splash screen.

### HOME
![image](https://github.com/imrismaa/GDSC_SpotifyClone/blob/master/home.png)

This page is including ```bottom_navbar.xml``` as the bottom navbar. The recently played playlist has been created using CardView, GuideLine, ImageView, and TextView. Only the top playlists (recently played playlist) can be clicked and it will shows the detail of the playlist (songs, artists, etc.). The email or username input value will be saved on this activity and will be sent into ```SongActivity```.
```kotlin
with(binding){
  cardDm1.setOnClickListener {
    val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
    val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
    intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
    startActivity(intentToSongActivity)
  }
  cardDm2.setOnClickListener {
    val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
    val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
    intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
    startActivity(intentToSongActivity)
  }
//etc.
}
```
The "Today biggest hits" and "Made For You" playlist has been created using ```HorizontalScrolView```.

### PLAYLIST DETAIL  
![image](https://github.com/imrismaa/GDSC_SpotifyClone/blob/master/playlist_detail.png)

This is the last page of the Spotify app that I clone. There are only three example songs which has a favorite button, and it is clickable. 
```kotlin
var isLoved = false
  btnLike.setOnClickListener {
    if (isLoved == false) {
      btnLike.setBackgroundResource(R.drawable.baseline_favorite_24)
      isLoved = true
    }
    else {
      btnLike.setBackgroundResource(R.drawable.baseline_favorite_border_24)
      isLoved = false
    }
  }
  btnLikeSong1.setOnClickListener {
    if (isLoved == false) {
      btnLikeSong1.setBackgroundResource(R.drawable.baseline_favorite_24)
      isLoved = true
    }
    else {
      btnLikeSong1.setBackgroundResource(R.drawable.baseline_favorite_border_24)
      isLoved = false
    }
  }
// etc.
```
Also there is a back button which will navigate to the home page.
```kotlin
btnBackToMain.setOnClickListener {
  val intentToMainActivity = Intent(this@SongActivity, MainActivity::class.java)
  startActivity(intentToMainActivity)
}
```
The email or username input value will also saved in this page and will be shown.
```kotlin
val emailOrUsername = intent.getStringExtra(EXTRA_EMAILORUSERNAME)
txtDescription.setText("JKT48, Geisha, Raisa, and more \nMade for $emailOrUsername \n3h 24min")
```
