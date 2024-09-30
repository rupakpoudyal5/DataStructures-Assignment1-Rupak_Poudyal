package com.assignment1.java;

import java.util.Arrays;

public class ArtifactVault {
    private String[] artifacts;
    private int size;

    public ArtifactVault(int size) {
        this.size = size;
        this.artifacts = new String[size];
    }

    // Add an artifact to the first empty slot
    public String addArtifact(String name) {
        for (int i = 0; i < size; i++) {
            if (artifacts[i] == null) {
                artifacts[i] = name;
                return "Artifact '" + name + "' added.";
            }
        }
        return "Vault is full!";
    }

    // Remove an artifact by its name
    public String removeArtifact(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(artifacts[i])) {
                artifacts[i] = null;
                return "Artifact '" + name + "' removed.";
            }
        }
        return "Artifact not found.";
    }

    // Find an artifact using linear search
    public String findArtifactLinear(String name) {
        for (int i = 0; i < size; i++) {
            if (name.equals(artifacts[i])) {
                return "Artifact '" + name + "' found at position " + i;
            }
        }
        return "Artifact not found.";
    }

    // Find an artifact using binary search (assumes the array is sorted by name)
    public String findArtifactBinary(String name) {
        String[] sortedArtifacts = Arrays.stream(artifacts)
                                         .filter(x -> x != null)
                                         .sorted()
                                         .toArray(String[]::new);
        int left = 0, right = sortedArtifacts.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = sortedArtifacts[mid].compareTo(name);
            if (comparison == 0) {
                return "Artifact '" + name + "' found.";
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return "Artifact not found.";
    }
}

