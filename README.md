# SoulFirePluginExample

Example of how to make a plugin for SoulFire.

This example adds a hack jump boost to SoulFire, which by default gives the bot jump boost with the amplifier 2.
The amplifier and the plugin can be configured in the plugins menu under `Hack Jump Boost` and CLI flags are also registered.

Read the [SoulFire Java API reference](https://jd.soulfiremc.com). Match the API to the SoulFire version pinned in `gradle/libs.versions.toml`.

## Development

Read [CONTRIBUTING.md](CONTRIBUTING.md) for prerequisites, compatibility, validation, and pull requests.

```bash
./gradlew build test spotlessCheck
```

## Contributing and support

Read [CONTRIBUTING.md](CONTRIBUTING.md) for local setup and review expectations.
Use [SUPPORT.md](SUPPORT.md) for questions and issue routing.
Follow the [community code of conduct](https://github.com/soulfiremc-com/.github/blob/main/CODE_OF_CONDUCT.md) and report vulnerabilities through the [private security contacts](https://github.com/soulfiremc-com/.github/blob/main/SECURITY.md).
