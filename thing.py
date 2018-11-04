#! usr/bin/env python 3
import os

eyePath = 'imgDir\eyeImg'
hairPath = 'imgDir\hairImg'
bodyPath = 'imgDir\\bodyImg'
''''
def imgGet(listSuper):
	sepList = [i.split('\t') for i in fileVar]
	imgList = []
	for i in sepList:
		strang = ''
		RSID = i[0]
		SNP = i[3]
		if i[1] == '0.1':
			strang += 'M'
		if i[1] == '0.2':
			strang += 'F'
		if i[2] == '0.1':
			os.chdir(eyePath)
			strang += 'E'
			if 
		elif i[2] == '0.3':
			os.chdir(hairPath)
			strang += 'HH'
'''
os.chdir(bodyPath)
print(os.getcwd())
