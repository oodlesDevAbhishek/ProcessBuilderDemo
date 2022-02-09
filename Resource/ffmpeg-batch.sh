#! /bin/bash




/usr/bin/ffmpeg -i /home/abhishek/Documents/scaffold_1.0/testing/Resource/input_file.mp4 -c:v libx264 -c:a mp3 /home/abhishek/Documents/scaffold_1.0/testing/Resource/output.mp4

pid=$!
# print process is running with its PID
echo "Process with PID $pid is running...."
wait $pid

echo "conversion complete!"
