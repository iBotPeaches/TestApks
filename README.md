# TestApks
Lots of Apktool bugs require me to create test apks as unit-tests. I will start storing the source of those applications here.


## Building APKs
1. `cd Issue###` - Move into the directory that you wish to build.
2. `./gradlew assembleDebug` - Builds APK.
3. cd `app/builds/output/apk` - Move to build directory.
4. Find aligned and non-aligned debug builds here.

## Finding associated bug report
Simply match the IssueID to the bug reports here - https://github.com/iBotPeaches/Apktool
