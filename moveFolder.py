'''
This script didn't work
'''
import os

Path = os.getcwd()
files = os.listdir()

for file in files:
    if "-Jan-" in file:
        jan_folers= os.path.abspath(file)
        new_jan_folders = os.path.join(Path,"Jan/"+file)
        os.replace(file, new_jan_folders)