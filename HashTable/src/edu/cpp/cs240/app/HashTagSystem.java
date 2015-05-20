package edu.cpp.cs240.app;

import edu.cpp.cs240.generics.HashTable;
import edu.cpp.cs240.generics.HashTableImpl;

public class HashTagSystem {

	HashTable<String, GenericList<String>> hashTable =
			new HashTableImpl<String, GenericList<String>>();

	public void newTwitt(String hashtag, String twitt) {
		GenericList<String> twitts = hashTable.get(hashtag);
		if (twitts == null) {
			twitts = new GenericArrayList<String>();
		}
		twitts.add(twitt);
		hashTable.put(hashtag, twitts);
	}

	public GenericList<String> searchHashtag(String hashtag) {
		return hashTable.get(hashtag);
	}

	public static void main(String[] args) {
		HashTagSystem system = new HashTagSystem();
		system.newTwitt("MothersDay", "This is a great #MothersDay!");
		system.newTwitt("MothersDay", "#MothersDay is awesome!");
		system.newTwitt("MothersDay", "I bought this for my #MothersDay!");
		system.newTwitt("MothersDay", "What would you do for #MothersDay?");
		system.newTwitt("NBADraft", "#NBADraft is awesome!");
		system.newTwitt("NBADraft", "I bought this for my #NBADraft!");
		system.newTwitt("NBADraft", "What would you do for #NBADraft?");

		System.out.println(system.searchHashtag("MothersDay"));
		System.out.println(system.searchHashtag("NBADraft"));
	}
}
