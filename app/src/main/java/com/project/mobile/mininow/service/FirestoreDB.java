package com.project.mobile.mininow.service;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;

public class FirestoreDB {

    private FirestoreDB() {};

    public static FirebaseFirestore getInstance() {
        return FirestoreDBHelper.INSTANCE;
    }

    private static class FirestoreDBHelper {
        private static final FirebaseFirestore INSTANCE = FirebaseFirestore.getInstance();

        static {
            FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
                    .setTimestampsInSnapshotsEnabled(true)
                    .build();
            INSTANCE.setFirestoreSettings(settings);
        }
    }
}
