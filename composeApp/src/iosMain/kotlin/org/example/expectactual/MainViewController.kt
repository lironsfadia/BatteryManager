package org.example.expectactual

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController { App(batteryManager = BatteryManager()) }