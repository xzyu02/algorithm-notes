import pandas as pd
import numpy as np
import os
from notes_for_each_category import *

f = open('README.md', 'w')
df = pd.read_csv("./notes.csv")

name_l1 = ["Data Structure", "Algorithm", "Others"]
path_l1 = ["data-structures", "algorithm", "others"]
name_l2 = [
    ["LinkedList", "Tree", "Binary Search Tree (BST)", "Trie", "Queue", "Stack", "HashTable", "Graph", "Priority Queue"],
    ["Two-Pointers", "Sort", "Greedy", "Divide and Conquer (DC)", "Dynamic Programming (DP)", "Sliding Window", "Backtrace", "Binary-Search"],
    ["Bit Manipulation", "String", "Math", "Others"]]
tags_l2 = [
    ["linked-list", "tree", "bst", "trie", "queue", "stack", "hash", "graph", "pq"],
    ["pointers", "sort", "greedy", "dc", "dp", "sliding-window", "backtrace", "binary-search"],
    ["bit", "string", "math", "others"]]

write_intro(f)

# write in-page hyperlink
write_link(f)

f.write("\n")

# write questions
for i in range(len(path_l1)):
    f.write(f"> # {name_l1[i]}\n\n")

    # iterate each tag
    for j in range(len(tags_l2[i])):
        tag = tags_l2[i][j]
        f.write(f"## {name_l2[i][j]}\n\n")

        write_special(f, tag)

        f.write("| Questions | Solutions | Notes |\n| --- | --- | --- |\n")

        # iterate each question
        current_df = df.query(f"Tags == '{tag}'")
        for _, row in current_df.iterrows():
            number = row['Number']
            question = f"{number}. {row['Name']}"
            filepath = f"[Solution](./{path_l1[i]}/{tag}/{number}.java)"
            bold = row['Bold']
            notes = row['Notes']
            if bold == 'T':
                question = f"**{question}**"
            if notes is np.nan:
                notes = ""
            # write each line
            f.write(f'| {question} | {filepath} | {notes} |\n')
        f.write("\n")

        write_tree(f, tag)
        
write_ref(f)
f.close()    

