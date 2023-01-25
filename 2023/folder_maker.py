import os

Path = os.getcwd()

months =["Feb","March","April", "May", "June",  "July", "August", "September", "October", "November", "December" ]
for month in months:
    month_path = os.path.join(Path, month)
    os.mkdir(month_path)
    # setting no. of days
    if month == "Feb":
        days =28
    elif month in ["March","May", "July", "August", "October", "December" ]:
        days =31
    else:
        days =30
    
    #creating days folders in months
    for date in range(1, days+1):
        # I got error in the below line as join only accepts string.
        # This script worked fine.
        day_path = os.path.join(month_path, str(date) )
        os.mkdir(day_path)


    




