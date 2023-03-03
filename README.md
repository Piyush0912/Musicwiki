# MusicWiki
MusicWiki is an unofficial Last.fm app that contains information about different music genres, the albums, artists and tracks listed under a particular genre.

## Built using - 
- Kotlin Programming Language
- [lastfm api](https://www.last.fm/api)
- Glide Image Library
- Retrofit Library
- Android Studio

## Features of the app - 
- The App uses MVVM architecure & coroutines to asynchronously call the API. 
- Then on the HomeScreen/Mainactivity it displays the list of the available genres. 
- Clicking on the genre it takes the user to the 'GenreInfo Activity' which contains information regarding it like - the title, description.
- In this very screen or activity there is a viewpager which displays the list of top albums, top tracks and top artists as different sections.
> - Each item listed under the album shows the title, artist name and the cover image if available or the default launcher image.
> - Each item listed under the artists shows the artist name and the cover image if available or the default launcher image.
> - Each item listed under tracks shows the title, artist name and the cover image if available or the default launcher image.
- On click AlbumItem -> it takes you to the 'AlbumInfo Activity' 
> The 'AlbumInfo Activity' displays the cover image, title and the artist information which includes the the description and the list of genres in a horizontal recyclerview. Clicking on the genre it takes you to the 'GenreInfo Activity' as explained above and the flow continues. 
- On click ArtistItem -> it takes you to the 'ArtistInfo Activity' 
> The 'ArtistInfo Activity' displays the image, title ,play count and listeners, description. Adding to this it shows a list of top tracks and top albums and the genres displayed using a horizontal recyclerview. Clicking on the genre it takes you to the 'GenreInfo Activity' and clicking on the album it takes you the previously explained 'AlbumInfo Activity' and the flow remains constant.

## Working of the app -




https://user-images.githubusercontent.com/90132390/222717473-a1f3986b-ac6a-4414-9719-01abd986bcb1.mp4

