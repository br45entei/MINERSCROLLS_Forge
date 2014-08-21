@echo off
start "" /B /WAIT gradlew.bat setupDevWorkspace
start "" /B /WAIT gradlew.bat eclipse
start "" /B /WAIT gradlew setupDecompWorkspace --refresh-dependencies
echo All done, press any key to exit...
PAUSE >nul
exit
