# How to contribute

In order to contribute to this project, start by opening an issue on this project so we can talk about your contribution. Then fork the project and start working on your fork. Once you are ready, submit a pull request on this repository and I will review your work.

## Development Environment

- Download [Eclipse Mars 1](https://www.eclipse.org/downloads/)
- Install Xtext and Sirius using the regular Eclipse Mars update site (http://download.eclipse.org/releases/mars)
- Clone this Git repository
- Import the projects of the Git repository in your project
- Go to the preference menu, then Plug-in Development, then Target Platform and select Eclipse Neon

## Build the project

- Go into the folder releng/org.obeonetwork.sirius.text.releng
- Use maven with the command: mvn clean verify
