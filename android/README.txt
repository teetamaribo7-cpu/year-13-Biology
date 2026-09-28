Year 12 Biology Revision – St Louis High School
Created by the Biology Teacher

OPEN IN ANDROID STUDIO
1. Unzip this folder.  2. Android Studio > File > Open > choose the StLouisY12Biology folder.
3. Wait for Gradle sync to finish (first time needs internet).
4. Build > Generate App Bundles or APKs > Build APK(s)  -- or choose the "release" build variant.
   Release APK: app/build/outputs/apk/release/app-release.apk (already signed with the St Louis key).

EDIT CONTENT: app/src/main/assets/index.html
  const MCQ = [ ...   quiz questions
  const NOTES = ...   strand notes
  SOL[2018] ... SOL[2025]   exam solutions
For each new version, raise versionCode (e.g. 3) and versionName (e.g. "1.2") in app/build.gradle.

SIGNING KEY: app/keystore/stlouis-biology-key.jks  alias: biology  password: stlouis123
Keep it safe and always use the same key, so updates install over the old app.
