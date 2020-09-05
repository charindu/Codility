#!/bin/bash
STRING='Files have been organized..'
mkdir -p music
mkdir -p images
mkdir -p videos
find . -type f -name '*.log' -delete
mv -f *.mp3 *.flac music
mv -f *.jpg *.png images
mv -f *.avi *.mov videos
echo $STRING
