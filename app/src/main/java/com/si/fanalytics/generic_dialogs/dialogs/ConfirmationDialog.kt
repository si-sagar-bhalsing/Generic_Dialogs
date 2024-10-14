package com.si.fanalytics.generic_dialogs.dialogs

import androidx.compose.runtime.Composable

@Composable
fun ConfirmationDialog(
    title: String,
    message: String,
    onConfirmClick: () -> Unit,
    onDismissClick: () -> Unit
) {
    GenericAlertDialog(
        title = title,
        message = message,
        onDismissRequest = onDismissClick,
        onConfirmClick = onConfirmClick,
        confirmText = "Yes",
        dismissText = "No"
    )
}
