# Biology Revision apps – St Louis High School

| App | Link for students |
| --- | --- |
| Year 12 Biology Revision (KSSC papers 2018–2025) | `https://teetamaribo7-cpu.github.io/year-13-Biology/` |
| Year 13 Revision Biology (SPFSC papers 2017–2025) | `https://teetamaribo7-cpu.github.io/year-13-Biology/year13/` |

Both apps work fully offline once they have been opened one time.

**Android download (APK) for Year 13:** `https://teetamaribo7-cpu.github.io/year-13-Biology/downloads/Year13RevisionBiology.apk`
(open on an Android phone, tap the downloaded file, allow "Install unknown apps" if asked). iPhones cannot use APK files, so iPhone users use the link in the table.

## iPhone and iPad: install the app

Apple does not let iPhones install apps from a file (there is no iPhone version of an `.apk`).
The app is published as a web app instead. It installs from Safari with its own icon, opens
full screen, and works offline.

1. Open the app's link (see the table above) in **Safari**.
2. Tap the **Share** button (the square with an arrow pointing up).
3. Scroll down and tap **Add to Home Screen**, then tap **Add**.
4. Open **Y12 Biology** or **Y13 Biology** from the Home Screen. After the first time, it works without internet.

The same link also works on Android phones (Chrome ⋮ menu → *Add to Home screen* / *Install app*)
and on computers.

## Publish the link (one time, for the teacher)

1. On GitHub, open this repository → **Settings** → **Pages**.
2. Under **Build and deployment → Source**, choose **GitHub Actions**.
3. Go to the **Actions** tab → **Publish iPhone web app** → **Run workflow**.
4. After about a minute both links above are live. Every later push re-publishes it automatically.

## Updating the content

- Year 12: edit `index.html` (quiz questions in `const MCQ`, notes in `const NOTES`, exam solutions in `SOL[...]`).
- Year 13: edit `year13/index.html` (search for `S(1,`, `S(2,` …: NOTE = notes, Q = multiple choice with the first answer correct, P = past exam question, D = definition question).
- Change `VERSION` in that app's `sw.js` (for example `y12bio-v1.2`) so phones pick up the new version.
- To update an Android app as well, copy the edited `index.html` into `android/…` or `android-year13/…` under `app/src/main/assets/`.

## Files

| Path | What it is |
| --- | --- |
| `index.html` | The whole Year 12 app |
| `downloads/Year13RevisionBiology.apk` | The signed Year 13 Android app, for direct download |
| `year13/` | The whole Year 13 app, with its own manifest, icons and `sw.js` |
| `manifest.webmanifest`, `icons/` | App name and Home Screen icon |
| `sw.js` | Offline support |
| `.github/workflows/pages.yml` | Publishes the web app to GitHub Pages |
| `android-year13/` | The Year 13 Android Studio project |
| `android/` | The Year 12 Android Studio project (APK). The signing key is not stored here; keep your `.jks` file somewhere safe. |
