@echo off
start "Gradle" /B /WAIT gradlew.bat build
echo All done, press any key to exit...
::PAUSE >nul
exit
