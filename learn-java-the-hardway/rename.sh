#!/bin/bash
# changes folder names from ex1 to ex01 for example
echo 'how many folders to rename'
  read num
  for i in $(seq 1 "$num")
do
  if [ $i == 10 ]
  then
    mv example0$i ex$i
 else
        mv example0$i ex0$i
fi
done
