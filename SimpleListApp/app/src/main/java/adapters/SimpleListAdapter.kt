package adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplelistapp.databinding.ListItemBinding

class SimpleListAdapter : RecyclerView.Adapter<SimpleListAdapter.SimpleListViewHolder>() {

    private var itemsList = ArrayList<String>()

    fun setSimpleList(simpleList: ArrayList<String>){
        this.itemsList = simpleList
        notifyDataSetChanged()
    }

    class SimpleListViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleListViewHolder {
        return SimpleListViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount() = itemsList.size

    override fun onBindViewHolder(holder: SimpleListViewHolder, position: Int) {
        holder.binding.itemText.text = itemsList[position]
    }
}