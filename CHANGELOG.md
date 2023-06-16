<!-- Keep a Changelog guide -> https://keepachangelog.com -->

# RedLib-Command-File Changelog

## [Unreleased]
- Use a new version of the plugin template
- Move the project to use Kotlin

## [0.2.18]
- Updated to be compatible with 2022.3

## [0.2.17]
- Updated to be compatible with 2022.2
- Updated the testing IDE to be 2022.2

## [0.2.16]
- Small hotfix

## [0.2.15]
- Fixed a bug which `hidesub` is not properly highlighted.
- Fixed not being able to use keywords as command names
- Added commenter to allow commenting via hotkey

## [0.2.13]

## [0.2.12]
- Fixed flags being broken from adding constraints
- Added support for the `hidesub` tag

## [0.2.11]
- Disabled postarg for base commands and the children of consuming commands
- Optimized file size
- Added support for consuming args with constraints
- Added support for consuming args with constraints with default values
- Added support for constraints
- Fixed a bug where it would allow consuming arguments after one non-consuming subcommand
- Fixed a bug where context and assert would only accept 2 words and nothing else
- Fixed a bug where you can't have postargs in the command if it has a consuming argument

## [0.2.10]
- Fixed a bug where you can't have empty lines between commands

## [0.2.9]
- Added brace matching

## [0.2.6]

## [0.2.5]
- Fixed default value not being able to be empty
- (Hopefully) Fixed the description to be plugin repo compliant

## [0.2.4]
- Added comments and their syntax highlighting

## [0.2.2]
- Added syntax highlighting

## [0.2.1]
- Added `Helpmsg` the forgotten child

## [0.2.0]
- Added command arguments
- Still cryptic prompt messages

## [0.1.1]
- Completed all command properties

## [0.0.3]
- Added basic functionality
- Added basic functionality
- Added basic functionality
- Added basic functionality

### Added
- Initial scaffold created from [IntelliJ Platform Plugin Template](https://github.com/JetBrains/intellij-platform-plugin-template)