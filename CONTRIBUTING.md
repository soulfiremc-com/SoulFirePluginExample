# Contributing to SoulFirePluginExample

This repository demonstrates a SoulFire plugin and its mixin integration.
This guide covers local development, validation, and pull requests.

## Before you start

Search [open and closed issues](https://github.com/soulfiremc-com/SoulFirePluginExample/issues) before reporting a problem or proposing a feature.
Small fixes can go directly to a pull request. Discuss substantial changes in an issue before implementation.
For usage questions and issue routing, read [SUPPORT.md](SUPPORT.md).
Follow the [community code of conduct](https://github.com/soulfiremc-com/.github/blob/main/CODE_OF_CONDUCT.md).
Report vulnerabilities privately through the [security policy](https://github.com/soulfiremc-com/.github/blob/main/SECURITY.md).

## Prepare and build

Install Git and a JDK 25. Use the checked-in Gradle wrapper.
The build needs network access for Minecraft, Fabric, Gradle, and the SoulFire artifacts pinned in `gradle/libs.versions.toml`.
Clone this repository or your fork, then run:

```bash
./gradlew build test spotlessCheck
```

On Windows, use `gradlew.bat` for Gradle commands.
The remapped plugin JAR appears under `build/libs/`.
Use `./gradlew remapJar` for the Fabric-ready artifact.
This plugin is not a standalone Minecraft client. The build intentionally removes Loom run configurations.

## Source layout and compatibility

- `src/main/java/com/soulfiremc/pluginexample/`: plugin registration, server extension, and mixin code.
- `src/main/resources/`: Fabric metadata, mixin configuration, and access widener.
- `gradle/libs.versions.toml`: Minecraft, Fabric loader, SoulFire, and Lombok pins.
- `buildSrc/`: Java, licensing, formatting, and analysis conventions.

Keep the example small enough for a new plugin author to understand.
Explain new extension points and update README examples with behavior changes.
Keep the Fabric entry points, mixin configuration, and access widener aligned with Java changes.
Do not assume that the current server release matches the pinned example dependencies.
Include the exact tested SoulFire revision or release in your pull request.
For dependency upgrades, update related pins together and verify the plugin on that server version.

## Style and validation

Follow `.editorconfig` and existing Java conventions. Use descriptive names and explicit resource cleanup.
Spotless manages headers, imports, trailing whitespace, and final newlines.
Run `./gradlew spotlessApply` before submission and review its diff.
Keep license notices consistent with the material you change.

Run `./gradlew build test spotlessCheck` before submission.
The example currently has no dedicated test suite. The Gradle test task does not replace a plugin load check.
For changed behavior, add focused tests where practical and run the JAR on a local SoulFire instance.
Verify that the extension loads, its settings appear, and the changed behavior works on an owned test server.
Include startup logs without credentials and describe any manual checks that you could not run.
For dependency resolution failures, include the failed artifact coordinate and repository URL.

## Submit a pull request

Keep the change focused on one problem. Avoid unrelated formatting and dependency updates.
Use Conventional Commit subjects such as `docs(contributing): clarify local setup` or `fix(build): correct packaging`.
Use a meaningful scope, imperative wording, and a subject under 72 characters.
For non-trivial changes, add a body that explains the motivation and important tradeoffs.
For breaking changes, include a `BREAKING CHANGE:` footer and migration instructions.
Do not bypass Git hooks. Let all configured checks finish.

Complete the pull request template with the problem, resulting behavior, and affected files.
If a related issue exists, link it.
Use `Closes #123` only if the change fully resolves that issue.
Record build and formatting commands, the tested server version, and plugin load observations.
Explain any checks that you could not perform.
For visible changes, include screenshots and the environment used to capture them.
Open a draft for early feedback on substantial changes.
Respond to review comments and rerun affected checks after revisions.

Update documentation and examples with behavior changes. Remove obsolete code rather than leaving placeholders or shims.
Do not commit credentials, private logs, dependency directories, or generated build artifacts.
Respect existing license notices and submit only material that you have the right to contribute.
