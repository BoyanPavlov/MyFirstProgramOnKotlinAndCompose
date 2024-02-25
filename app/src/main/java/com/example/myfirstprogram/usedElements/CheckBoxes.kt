package com.example.myfirstprogram.usedElements

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState


data class ToggleableInfo(
    val isChecked: Boolean = false,
    val text: String
)

@Composable
fun CheckBoxes(modifier: Modifier = Modifier) {
    val checkboxes = remember {
        mutableStateListOf(
            ToggleableInfo(
                isChecked = false,
                text = "Photos"
            ),

            ToggleableInfo(
                isChecked = false,
                text = "Videos"
            ),

            ToggleableInfo(
                isChecked = false,
                text = "Audio"
            )
        )
    }


    var triState by remember {
        mutableStateOf(ToggleableState.Indeterminate)
    }

    val toggleTristate = {
        triState = when (triState) {
            ToggleableState.Indeterminate -> ToggleableState.On
            ToggleableState.On -> ToggleableState.Off
            else -> ToggleableState.On
        }
    }

    TriStateCheckbox(state = triState, onClick = {

    })


    checkboxes.forEachIndexed { index, info ->
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = info.isChecked,
                onCheckedChange = { isChecked ->
                    checkboxes[index] = info.copy(
                        isChecked = isChecked
                    )
                })
            Text(text = info.text)
        }
    }

}