package com.example.appanalytics.listener

import com.example.appanalytics.news.Note

interface OnClickNote {
    fun onClick(note: Note)
}