#  Dev-ProjectTemplate.g8
[![build status](https://build.mdsd.tools/job/MDSD-Tools/job/Dev-ProjectTemplate.g8/job/master/badge/icon)](https://build.mdsd.tools/job/MDSD-Tools/job/Dev-ProjectTemplate.g8/job/master)
[![open issues](https://img.shields.io/github/issues/mdsd-tools/Dev-ProjectTemplate.g8)](https://github.com/MDSD-Tools/Dev-ProjectTemplate.g8/issues)
[![open pull requests](https://img.shields.io/github/issues-pr/mdsd-tools/Dev-ProjectTemplate.g8)](https://github.com/MDSD-Tools/Dev-ProjectTemplate.g8/pulls)
[![used license](https://img.shields.io/github/license/mdsd-tools/Dev-ProjectTemplate.g8)](https://github.com/MDSD-Tools/Dev-ProjectTemplate.g8/blob/master/LICENSE)

This repository is a template repository for projects providing Eclipse-based functionality using the giter8 templating approach. The template is based on the template repository in https://github.com/MDSD-Tools/Dev-EclipseBasedProjectTemplate.

## Contents
The template repository contains a fully working build of all commonly used types of Eclipse artifacts. The repository also contains the meta data for integrating it into our Jenkins-based continuous integration. The contained Eclipse artifact types are
* bundle
* feature
* test bundle
* update site

Additionally, the project demonstrates the usage of the model generation workflow to generate source code for Ecore meta models. The workflow uses the [Ecore-Workflow](https://github.com/MDSD-Tools/Ecore-Workflow) library to realize the model generation and integration of custom code. For more information regarding configuration options, please refer to the [Ecore-Workflow](https://github.com/MDSD-Tools/Ecore-Workflow) repository.

## How to use this repo
* Install [sbt](https://www.scala-sbt.org/)
* Run
```
sbt new mdsd-tools/dev-projecttemplate.g8
```
