# Map Crash Fixer Mod <img src="https://raw.githubusercontent.com/TechStreetDev/Map-Crash-Fixer-Mod/1.17.1/src/main/resources/assets/mapfixer/icon.png" width="50" height="50"/>
This `1.17.1` mod fixes map crashes:

Maps contain an array of bytes that each represent their own colors and hes the explaination.

Minecraft has a limited amount of colors, as a result they have the map color array
sized to have the appropriate amount of colors.
However, not every color is used yet. This means some objects stored in the array
are NULL.

Because these colors do not exist you should never run into issues.
However, the issue playing Minecraft right now which causes people to crash is
due to these colors being sent to the client. Specifically, empty maps seem to all be
-1... which when deserialized turns out to be ~63rd index in the MapColor array.

Simply this will replace these null colors with fake colors. This should prevent the crash.

Huge thanks to [Owen1212055](https://github.com/Owen1212055) for the original code, I just made it into a mod!

## Contribution

Want to add new features to the mod or fix bugs yourself? Please read [CONTRIBUTION.md](CONTRIBUTION.md) for important guidelines to follow.
