package otus.homework.flowcats

import android.content.Context
import android.util.AttributeSet
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import otus.homework.flowcats.databinding.ActivityMainBinding

class CatsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), ICatsView {

    lateinit var binding: ActivityMainBinding

    override fun onFinishInflate() {
        super.onFinishInflate()
        binding = ActivityMainBinding.bind(this)
    }

    override fun populate(fact: Fact) {
        binding.factTextView.text = fact.text
    }

    override fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}

interface ICatsView {

    fun populate(fact: Fact)

    fun toast(message: String)
}
