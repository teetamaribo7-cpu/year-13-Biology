# Year 12 Biology Revision – St Louis High School

Revision app with strand notes, quizzes and KSSC past-paper solutions (2018–2025).
It works fully offline once it has been opened one time.

## iPhone and iPad: install the app

Apple does not let iPhones install apps from a file (there is no iPhone version of an `.apk`).
The app is published as a web app instead. It installs from Safari with its own icon, opens
full screen, and works offline.

**Link for students:** `https://teetamaribo7-cpu.github.io/year-13-Biology/`

1. Open the link in **Safari**.
2. Tap the **Share** button (the square with an arrow pointing up).
3. Scroll down and tap **Add to Home Screen**, then tap **Add**.
4. Open **Y12 Biology** from the Home Screen. After the first time, it works without internet.

The same link also works on Android phones (Chrome ⋮ menu → *Add to Home screen* / *Install app*)
and on computers.

## Publish the link (one time, for the teacher)

1. On GitHub, open this repository → **Settings** → **Pages**.
2. Under **Build and deployment → Source**, choose **GitHub Actions**.
3. Go to the **Actions** tab → **Publish iPhone web app** → **Run workflow**.
4. After about a minute the link above is live. Every later push re-publishes it automatically.

## Updating the content

- Edit `index.html` (quiz questions in `const MCQ`, notes in `const NOTES`, exam solutions in `SOL[...]`).
- Change `VERSION` in `sw.js` (for example `y12bio-v1.2`) so phones pick up the new version.
- To update the Android app as well, copy `index.html` into `android/app/src/main/assets/`.

## Files

| Path | What it is |
| --- | --- |
| `index.html` | The whole app |
| `manifest.webmanifest`, `icons/` | App name and Home Screen icon |
| `sw.js` | Offline support |
| `.github/workflows/pages.yml` | Publishes the web app to GitHub Pages |
| `android/` | The original Android Studio project (APK). The signing key is not stored here; keep your `.jks` file somewhere safe. |
