# Reusable Jetpack Compose Pop-up Components

## Overview
This project contains a set of reusable and customizable pop-up components designed for use in Jetpack Compose applications. These components simplify the creation of dialogs, bottom sheets, and alert pop-ups with customizable UI elements like titles, messages, images, and actions.

## Components

### 1. GenericAlertDialog
A versatile dialog used for alerts, confirmations, or displaying information. Accepts customizable parameters such as title, message, and button text.

```kotlin
GenericAlertDialog(
    title = "Alert Title",
    message = "This is a sample message",
    onDismissRequest = { /* Handle dismiss */ },
    onConfirmClick = { /* Handle confirmation */ },
    confirmText = "OK",
    dismissText = "Cancel"
)

### 2. CustomImageDialog
This dialog supports images along with titles, descriptions, and action buttons, making it useful for promotional or update dialogs where visuals are required.

```kotlin
CustomImageDialog(
    painter = painterResource(R.drawable.sample_image),
    title = "Update Available",
    description = "A new update is available for your app.",
    onDismissRequest = { /* Handle dismiss */ },
    onConfirmClick = { /* Handle confirmation */ }
)

### 3. GenericBottomSheet
A bottom sheet component that dynamically accepts any composable content, useful for displaying additional actions or contextual information.

```kotlin
GenericBottomSheet(
    sheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden),
    content = {
        Text("This is a reusable bottom sheet")
    },
    onDismissRequest = { /* Handle dismiss */ }
)

### 4. ConfirmationDialog
A reusable confirmation dialog for "yes/no" decisions, such as delete confirmations or approvals.
ConfirmationDialog(
    title = "Delete Item",
    message = "Are you sure you want to delete this item?",
    onConfirmClick = { /* Handle confirmation */ },
    onDismissClick = { /* Handle dismiss */ }
)
