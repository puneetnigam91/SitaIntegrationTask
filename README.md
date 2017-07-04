# SitaTask Details

##



Files are input at location C:\SITA_TEST_TASK\IN.
Input files can be a valid or invalid depending upon (if other than number is present in the input file)
This appliaction works as per below algo:
1. Files only which have .txt extension will be picked.
2. Files are read from the input directory to check if any new files has arrived in every 5 seconds.
3. If a new file is found, then the application sums all the numbers in the file and create a new file containing the resulting value in the directory (C:\SITA_TEST_TASK\OUTPUT). 

4. Post this input file is moved to C:\SITA_TEST_TASK\PROCESSED directory with .PROCESSED as extension. 

5. In case of any invalid files, file is moved to (C:\SITA_TEST_TASK\ERROR) directory. 

6. All the input files after processing should not exist in the input directory.


## To build the application

1. From the command prompt go to project folder and run command mvn clean install.



## Testing the application.

1. Before running the application, place the input files in the input directory configured under application.properties.

2. Deploy the war SitaSampleFileProcessingTask.war and it will start processing from input folder.

