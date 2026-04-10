# CSSECDV-MP S31 - GROUP 5

## Project Members/Collaborators
- Lourenz Jhay Baniqued
- Hans Jared Sescon
- Ryu Kisen Unisan

## Overview

This is a Java Swing desktop application that uses SQLite for persistence. It includes role-based access control, login auditing, validation logging, and safe error handling.

## How To Run

### Prerequisites

- Java 17 or later
- The bundled SQLite JDBC driver: `java -jar dist\CSSECDV.jar`

### Run From Terminal

From the project root directory on your machine, run:

```powershell
java -jar dist\CSSECDV.jar
```

### Expected Startup Behavior

- The app creates or opens `database.db` in the project root.
- The seeded demo users are loaded on startup.
- The login screen appears after initialization.

### Demo Credentials

All seeded demo users use the password `Qwerty1234!`.

- `admin` - Admin role
- `manager` - Manager role
- `staff` - Staff role
- `client1` - Client role
- `client2` - Client role
