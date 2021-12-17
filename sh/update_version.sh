#!/bin/bash
 
oldVersion=`cat $1 | grep -Po '\d+\.\d+\.\d+'`
array=(${oldVersion//./ })
let "next=array[2]+1"
newVersion="${array[0]}.${array[1]}.$next"
function="s/$oldVersion/$newVersion/g"
sed -i $function $1