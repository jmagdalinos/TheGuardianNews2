package com.johnmagdalinos.android.newsworld.presenter;

import com.johnmagdalinos.android.newsworld.model.NewsArticle;

import java.util.ArrayList;

/**
 * Contains the interfaces and methods used by the NewsPresenter and the NewsListFragment in order to
 * allow communication between the two classes
 */

public interface MvPContract {

    /** Passes the data from the Presenter to the View */
    interface BaseView {
        void setPresenter(BasePresenter presenter);

        void showNews(ArrayList<NewsArticle> articles);

        void showToastMessage(String message);
    }

    /** Passes the input or news to the Presenter */
    interface BasePresenter {
        void inputToPresenter(BaseView baseView, String sectionTitle);

        void newsToPresenter(ArrayList<NewsArticle> articles);
    }
}
