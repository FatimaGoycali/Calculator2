package com.example.calculator2

import android.app.Notification.Action
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.calculator2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: CalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)
        binding.viewmodel = viewModel
        binding.view = this

        binding.state = viewModel.state


    }

    fun onActionViewModel(type: Int) {

        when (type) {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> {
                viewModel.onAction(CalculatorAction.Number(type))
                binding.state = viewModel.state

            }

            ActionType.DEL.type -> {
                viewModel.onAction(CalculatorAction.Delete)
                binding.state = viewModel.state

            }

            ActionType.AC.type -> {
                viewModel.onAction(CalculatorAction.Clear)
                binding.state = viewModel.state
            }


            ActionType.DECIMAL.type -> {
                viewModel.onAction(CalculatorAction.Decimal)
                binding.state = viewModel.state

            }

            ActionType.CALCULATION.type -> {
                viewModel.onAction(CalculatorAction.Calculate)
                binding.state = viewModel.state

            }


            ActionType.ADD.type -> {
                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                binding.state = viewModel.state

            }

            ActionType.SUBTRACT.type -> {
                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                binding.state = viewModel.state

            }

            ActionType.DIVIDE.type -> {
                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                binding.state = viewModel.state


            }

            ActionType.MULTIPLY.type -> {
                viewModel.onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                binding.state = viewModel.state

            }


        }
    }

}