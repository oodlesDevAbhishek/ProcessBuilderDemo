#! /bin/bash

srcPath=$1
destPath=$2


/usr/bin/ffmpeg -i $srcPath -c:v libx264 -c:a mp3 $destPath

echo "Done by using args...!"



