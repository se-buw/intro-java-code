# Introduction to Programming with Java: example code

The example programs of the lectures, one folder per lecture in `code/`.
New lectures are added here when they are released.

Slides: <https://se-buw.de/teaching/intro-java/slides/> (course page: <https://se-buw.de/teaching/intro-java/>)

This repository is generated from the course materials; changes made here are overwritten.

## Setup

1. Install **JDK 25**, e.g. Eclipse Temurin from [adoptium.net](https://adoptium.net/),
   and **VS Code** with its **Extension Pack for Java**.
2. Clone this repository:

   ```bash
   git clone https://github.com/se-buw/intro-java-code.git
   ```

3. In VS Code: **File > Open Workspace from File… > `course.code-workspace`**.
   Each lecture folder is its own Java project.

If VS Code uses another Java version, add your JDK in the user settings under
`java.configuration.runtimes` with the name `JavaSE-25`.

## Get new lectures

```bash
git pull
```

Keep your own experiments in a separate folder or copy, so that `git pull` does not conflict with them.

## From the slides to the code

Listings on the slides have an **Open in VS Code** button. The first click asks for the folder of your
clone (e.g. `C:/Users/you/intro-java-code`); your browser remembers it, and the ⚙ button next to a
listing changes it.

## JavaFX lectures

The GUI lectures are Gradle projects. Open a program in `fx/` and start
**Run JavaFX program (current file)** in the *Run and Debug* view (F5); the first run downloads JavaFX.
On the command line: `./gradlew run -PmainClass=DoorSign` in the lecture's folder.
