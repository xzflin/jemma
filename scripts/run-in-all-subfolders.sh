#!/bin/bash 

CMD=$@

echo -e '****************************************'
echo -e "running [$CMD] in all subfolders\n"
echo -e '****************************************\n'

for d in  `ls`;
do
	if [ -d "$d" ]
	then
		echo -e '\n\n****************************************'
		echo running [$CMD] in [$d]
		echo -e '****************************************\n'
		cd $d
		$CMD
		cd ..
	fi

done
