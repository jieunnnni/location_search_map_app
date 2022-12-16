package com.example.searchmap_app

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.searchmap_app.databinding.ViewholderSearchResultItemBinding
import com.example.searchmap_app.model.entity.SearchResultEntity

class SearchRecyclerAdapter: RecyclerView.Adapter<SearchRecyclerAdapter.SearchResultItemViewHolder>() {

    private var searchResultList: List<SearchResultEntity> = listOf()
    private lateinit var searchResultClickListener: (SearchResultEntity) -> Unit

    class SearchResultItemViewHolder(val binding: ViewholderSearchResultItemBinding, val searchResultClickListener: (SearchResultEntity) -> Unit) : RecyclerView.ViewHolder(binding.root) {

        fun bindData(data: SearchResultEntity) = with(binding) {
            titleTextView.text = data.buildingName
            subtitleTextView.text = data.fullAddress
        }
        fun bindViews(data: SearchResultEntity) {
            binding.root.setOnClickListener {
                searchResultClickListener(data)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultItemViewHolder {  // SearchResultItemViewHolder 반환
        val view = ViewholderSearchResultItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SearchResultItemViewHolder(view, searchResultClickListener)
    }

    override fun onBindViewHolder(holder: SearchResultItemViewHolder, position: Int) {
        holder.bindData(searchResultList[position])
        holder.bindViews(searchResultList[position])
    }

    override fun getItemCount(): Int = searchResultList.size

    // 데이터를 반영해줌과 동시에 리스너를 같이 등록
    @SuppressLint("NotifyDataSetChanged")
    fun setSearchResultList(searchResultList: List<SearchResultEntity>, searchResultClickListener: (SearchResultEntity) -> Unit) {
        this.searchResultList = searchResultList
        this.searchResultClickListener = searchResultClickListener
        notifyDataSetChanged()
    }
}
