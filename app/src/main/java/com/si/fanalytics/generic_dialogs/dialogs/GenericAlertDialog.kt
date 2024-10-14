package com.si.fanalytics.generic_dialogs.dialogs

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties


/*
Generic AlertDialog
A basic alert dialog component that can accept any content for the title, message, and actions.
*/
@Composable
fun GenericAlertDialog(
    title: String,
    message: String,
    onDismissRequest: () -> Unit,
    onConfirmClick: () -> Unit,
    confirmText: String = "Confirm",
    dismissText: String = "Cancel",
    dismissOnOutsideClick: Boolean = true
) {
    AlertDialog(
        onDismissRequest = { onDismissRequest() },
        confirmButton = {
            TextButton(onClick = onConfirmClick) {
                Text(confirmText)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismissRequest) {
                Text(dismissText)
            }
        },
        title = { Text(text = title) },
        text = { Text(text = message) },
        properties = DialogProperties(dismissOnClickOutside = dismissOnOutsideClick)
    )
}
