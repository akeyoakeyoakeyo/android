package com.akeyo.loginregistrationmidmorn

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akeyo.loginregistrationmidmorn.ui.theme.LoginRegistrationMidMornTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegistrationMidMornTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Register()
                }
            }
        }
    }
}

@Composable
fun Register() {
    var name by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var context = LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Cyan)){
/*
        Text(text = "eMobilis Login",
            color = Color.Blue,
            fontSize = 35.sp,
            fontFamily = FontFamily.Cursive)*/

        OutlinedTextField(value = name,
            onValueChange = {name=it},
            label = {Text(text = "Enter name:",
                color = Color.Magenta,
                fontFamily = FontFamily.Default,
                fontSize = 20.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
//            keyboardActions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label = {Text(text = "Enter email address:",
                color = Color.Magenta,
                fontFamily = FontFamily.Default,
                fontSize = 20.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
//            keyboardActions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = {Text(text = "Enter Password:",
                color = Color.Magenta,
                fontFamily = FontFamily.Default,
                fontSize = 20.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
//            keyboardActions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        OutlinedTextField(value = password,
            onValueChange = {password=it},
            label = {Text(text = "Confirm Password:",
                color = Color.Magenta,
                fontFamily = FontFamily.Default,
                fontSize = 20.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),
//            keyboardActions = KeyboardOptions(imeAction = ImeAction.Next)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            /*modifier = Modifier
                .fillMaxWidth()*/) {
            Text(text = "Register",
                fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {  val intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent) },
            /*modifier = Modifier
                .fillMaxWidth()*/) {
            Text(text = "Click to login",
                fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context,IntentActivity::class.java)
            context.startActivity(intent)
        },
            /*modifier = Modifier
                .fillMaxWidth()*/) {
            Text(text = "Intent page",
                fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent = Intent(context,CalcActivity2::class.java)
            context.startActivity(intent)
        },
            /* modifier = Modifier
                 .fillMaxWidth()*/) {
            Text(text = "Calculator",
                fontSize = 20.sp)

        }
    }

}

@Preview
@Composable
private fun Registerprev() {
    Register()
}




