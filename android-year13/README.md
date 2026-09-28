# Year 13 Revision Biology – Android app

Free offline Year 13 Biology revision app for St Louis High School, based on the
SPFSC Biology papers 2017–2025. Created by the Biology Teacher.

Each strand (Animal Behaviour, Gene Expression, Biotechnology Applications,
Processes and Patterns of Evolution, Environmental Issues) has:
- Notes
- Full multiple-choice quiz with solutions and a mark at the end
- Definitions quiz
- Past exam questions with model solutions (filter by year)
Plus mixed exam practice and a My mistakes collection.

## Open and run
1. Android Studio > File > Open > choose the `Year13RevisionBiology` folder
   (the one containing `settings.gradle.kts`). Choose "This Window" and "Trust Project".
2. If asked "Please Select Gradle JVM", click **Use JVM 21**.
3. Wait for the green tick, choose your phone/emulator, press Run ▶.
4. To share: Build > Build Bundle(s) / APK(s) > Build APK(s) > locate.

This app has its own ID (com.stlouis.biology13), so it can be installed next to the other St Louis apps.

## Where things are
- Home screen buttons: `app/src/main/res/layout/activity_main.xml`, `MainActivity.kt`
- Notes, quiz questions and past-paper solutions: `app/src/main/assets/index.html`
  (search for `S(1,`, `S(2,` … – NOTE = notes, Q = multiple choice (first answer is correct),
  P = past exam question with solution, D = extra definition question)
