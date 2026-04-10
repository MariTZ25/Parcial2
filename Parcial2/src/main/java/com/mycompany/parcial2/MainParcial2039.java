/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial2;

/**
 *
 * @author Zedanc
 */
import java.time.LocalDate;

public class MainParcial2039 {
    
    public static void main(String[] args) {
        // Create ConnectUs
        ConnectUs net = new ConnectUs();

        // Create users
        net.addUser(new User(net, "john_doe", "John Doe", "john.doe@example.com", LocalDate.of(2023, 1, 1)));
        net.addUser(new User(net, "jane_smith", "Jane Smith", "jane.smith@example.com", LocalDate.of(2024, 6, 15)));
        net.addUser(new User(net, "bob_jones", "Bob Jones", "bob.jones@example.com", LocalDate.of(2025, 12, 31)));
        net.addUser(new User(net, "alice_williams", "Alice Williams", "alice.williams@example.com", LocalDate.of(2026, 3, 31)));
        net.addUser(new User(net, "charlie_brown", "Charlie Brown", "charlie.brown@example.com", LocalDate.of(2023, 1, 1)));
        net.addUser(new User(net, "dave_clark", "Dave Clark", "dave.clark@example.com", LocalDate.of(2024, 9, 20)));
        net.addUser(new User(net, "eve_miller", "Eve Miller", "eve.miller@example.com", LocalDate.of(2025, 7, 10)));
        net.addUser(new User(net, "frank_wilson", "Frank Wilson", "frank.wilson@example.com", LocalDate.of(2026, 3, 31)));
        net.addUser(new User(net, "grace_lee", "Grace Lee", "grace.lee@example.com", LocalDate.of(2023, 1, 1)));
        net.addUser(new User(net, "henry_taylor", "Henry Taylor", "henry.taylor@example.com", LocalDate.of(2024, 12, 31)));

        // Follow some users
        net.getUser("john_doe").follow(net.getUser("jane_smith"));
        net.getUser("john_doe").follow(net.getUser("bob_jones"));
        net.getUser("jane_smith").follow(net.getUser("alice_williams"));
        net.getUser("bob_jones").follow(net.getUser("charlie_brown"));
        net.getUser("alice_williams").follow(net.getUser("dave_clark"));
        net.getUser("charlie_brown").follow(net.getUser("eve_miller"));
        net.getUser("dave_clark").follow(net.getUser("frank_wilson"));
        net.getUser("eve_miller").follow(net.getUser("grace_lee"));
        net.getUser("frank_wilson").follow(net.getUser("henry_taylor"));
        net.getUser("grace_lee").follow(net.getUser("john_doe"));
        net.getUser("grace_lee").follow(net.getUser("jane_smith"));
        net.getUser("henry_taylor").follow(net.getUser("jane_smith"));
        net.getUser("henry_taylor").follow(net.getUser("bob_jones"));
        net.getUser("henry_taylor").follow(net.getUser("alice_williams"));
        net.getUser("henry_taylor").follow(net.getUser("charlie_brown"));

        // Create publications
        // Jhon Doe publications
        net.getUser("john_doe").postImage(2023000001, LocalDate.of(2023, 2, 1), "John's first image", 1080, "/path/to/john_image1.jpg");
        net.getUser("john_doe").postImage(2023000002, LocalDate.of(2023, 3, 1), "John's second image", 1080, "/path/to/john_image2.jpg");
        net.getUser("john_doe").postImage(2023000003, LocalDate.of(2023, 4, 1), "John's third image", 1080, "/path/to/john_image3.jpg");
        net.getUser("john_doe").postVideo(2023000004, LocalDate.of(2023, 5, 1), "John's first video", 120, 1080, "/path/to/john_video1.mp4");
        
        // Jane Smith publications
        net.getUser("jane_smith").postImage(2024000001, LocalDate.of(2024, 7, 1), "Jane's first image", 1080, "/path/to/jane_image1.jpg");
        net.getUser("jane_smith").postVideo(2024000002, LocalDate.of(2024, 8, 1), "Jane's first video", 90, 1080, "/path/to/jane_video1.mp4");
        net.getUser("jane_smith").postText(2024000003, LocalDate.of(2024, 9, 1), "Jane's first text post");
        net.getUser("jane_smith").postText(2024000004, LocalDate.of(2024, 10, 1), "Jane's second text post");
        net.getUser("jane_smith").postText(2024000005, LocalDate.of(2024, 11, 1), "Jane's third text post");
        
        // Bob Jones publications
        net.getUser("bob_jones").postVideo(2025000001, LocalDate.of(2025, 1, 1), "Bob's first video", 60, 1080, "/path/to/bob_video1.mp4");
        
        // Alice Williams publications
        net.getUser("alice_williams").postImage(2026000001, LocalDate.of(2026, 4, 1), "Alice's first image", 1080, "/path/to/alice_image1.jpg");
        net.getUser("alice_williams").postText(2026000002, LocalDate.of(2026, 5, 1), "Alice's first text post");

        // Charlie Brown publications
        net.getUser("charlie_brown").postImage(2023000005, LocalDate.of(2023, 6, 1), "Charlie's first image", 1080, "/path/to/charlie_image1.jpg");
        net.getUser("charlie_brown").postVideo(2023000006, LocalDate.of(2023, 7, 1), "Charlie's first video", 30, 1080, "/path/to/charlie_video1.mp4");
        net.getUser("charlie_brown").postVideo(2023000007, LocalDate.of(2023, 8, 1), "Charlie's second video", 45, 1080, "/path/to/charlie_video2.mp4");
        net.getUser("charlie_brown").postVideo(2023000008, LocalDate.of(2023, 9, 1), "Charlie's third video", 60, 1080, "/path/to/charlie_video3.mp4");
        net.getUser("charlie_brown").postVideo(2023000009, LocalDate.of(2023, 10, 1), "Charlie's fourth video", 90, 1080, "/path/to/charlie_video4.mp4");
        net.getUser("charlie_brown").postText(2023000010, LocalDate.of(2023, 11, 1), "Charlie's first text post");
        net.getUser("charlie_brown").postText(2023000011, LocalDate.of(2023, 12, 1), "Charlie's second text post");

        // Dave Clark publications
        net.getUser("dave_clark").postText(2024000006, LocalDate.of(2024, 1, 1), "Dave's first text post");
        net.getUser("dave_clark").postText(2024000007, LocalDate.of(2024, 2, 1), "Dave's second text post");
        net.getUser("dave_clark").postText(2024000008, LocalDate.of(2024, 3, 1), "Dave's third text post");
        net.getUser("dave_clark").postText(2024000009, LocalDate.of(2024, 4, 1), "Dave's fourth text post");
        net.getUser("dave_clark").postText(2024000010, LocalDate.of(2024, 5, 1), "Dave's fifth text post");
        net.getUser("dave_clark").postText(2024000011, LocalDate.of(2024, 6, 1), "Dave's sixth text post");

        // Eve Miller publications
        net.getUser("eve_miller").postImage(2025000002, LocalDate.of(2025, 2, 1), "Eve's first image", 1080, "/path/to/eve_image1.jpg");
        net.getUser("eve_miller").postImage(2025000003, LocalDate.of(2025, 3, 1), "Eve's second image", 1080, "/path/to/eve_image2.jpg");
        net.getUser("eve_miller").postImage(2025000004, LocalDate.of(2025, 4, 1), "Eve's third image", 1080, "/path/to/eve_image3.jpg");
        net.getUser("eve_miller").postImage(2025000005, LocalDate.of(2025, 5, 1), "Eve's fourth image", 1080, "/path/to/eve_image4.jpg");
        net.getUser("eve_miller").postImage(2025000006, LocalDate.of(2025, 6, 1), "Eve's fifth image", 1080, "/path/to/eve_image5.jpg");
        net.getUser("eve_miller").postVideo(2025000007, LocalDate.of(2025, 7, 1), "Eve's first video", 150, 1080, "/path/to/eve_video1.mp4");

        // Grace Lee publications
        net.getUser("grace_lee").postImage(2023000012, LocalDate.of(2023, 12, 15), "Grace's first image", 1080, "/path/to/grace_image1.jpg");
        net.getUser("grace_lee").postVideo(2023000013, LocalDate.of(2024, 1, 15), "Grace's first video", 60, 1080, "/path/to/grace_video1.mp4");
        net.getUser("grace_lee").postVideo(2023000014, LocalDate.of(2024, 2, 15), "Grace's second video", 90, 1080, "/path/to/grace_video2.mp4");
        net.getUser("grace_lee").postVideo(2023000015, LocalDate.of(2024, 3, 15), "Grace's third video", 120, 1080, "/path/to/grace_video3.mp4");
        net.getUser("grace_lee").postVideo(2023000016, LocalDate.of(2024, 4, 15), "Grace's fourth video", 150, 1080, "/path/to/grace_video4.mp4");
        net.getUser("grace_lee").postText(2023000017, LocalDate.of(2024, 5, 15), "Grace's first text post");
        net.getUser("grace_lee").postText(2023000018, LocalDate.of(2024, 6, 15), "Grace's second text post");

        // Henry Taylor publications
        net.getUser("henry_taylor").postVideo(2024000012, LocalDate.of(2024, 7, 1), "Henry's first video", 30, 1080, "/path/to/henry_video1.mp4");
        net.getUser("henry_taylor").postVideo(2024000013, LocalDate.of(2024, 8, 1), "Henry's second video", 60, 1080, "/path/to/henry_video2.mp4");
        net.getUser("henry_taylor").postVideo(2024000014, LocalDate.of(2024, 9, 1), "Henry's third video", 90, 1080, "/path/to/henry_video3.mp4");
        net.getUser("henry_taylor").postText(2024000015, LocalDate.of(2024, 10, 1), "Henry's first text post");
        net.getUser("henry_taylor").postText(2024000016, LocalDate.of(2024, 11, 1), "Henry's second text post");
        net.getUser("henry_taylor").postText(2024000017, LocalDate.of(2024, 12, 1), "Henry's third text post");

        // Make reactions
        // John Doe reactions
        net.getUser("john_doe").react(net.getPublication(2024000011), ReactionType.ANGRY, LocalDate.of(2024, 7, 2));
        net.getUser("john_doe").react(net.getPublication(2023000014), ReactionType.ANGRY, LocalDate.of(2024, 8, 2));
        net.getUser("john_doe").react(net.getPublication(2025000004), ReactionType.LIKE, LocalDate.of(2024, 9, 2));
        net.getUser("john_doe").react(net.getPublication(2023000007), ReactionType.LOVE, LocalDate.of(2024, 10, 2));
        net.getUser("john_doe").react(net.getPublication(2024000003), ReactionType.LOVE, LocalDate.of(2024, 11, 2));
        net.getUser("john_doe").react(net.getPublication(2023000017), ReactionType.FUNNY, LocalDate.of(2025, 1, 2));
        net.getUser("john_doe").react(net.getPublication(2026000002), ReactionType.LIKE, LocalDate.of(2026, 4, 2));
        net.getUser("john_doe").react(net.getPublication(2024000016), ReactionType.FUNNY, LocalDate.of(2026, 5, 2));
        net.getUser("john_doe").react(net.getPublication(2025000006), ReactionType.ANGRY, LocalDate.of(2023, 6, 2));

        // Jane Smith reactions
        net.getUser("jane_smith").react(net.getPublication(2023000012), ReactionType.LOVE, LocalDate.of(2023, 2, 2));
        net.getUser("jane_smith").react(net.getPublication(2024000008), ReactionType.LOVE, LocalDate.of(2023, 3, 2));
        net.getUser("jane_smith").react(net.getPublication(2023000003), ReactionType.ANGRY, LocalDate.of(2023, 4, 2));
        net.getUser("jane_smith").react(net.getPublication(2025000003), ReactionType.LIKE, LocalDate.of(2023, 5, 2));
        net.getUser("jane_smith").react(net.getPublication(2024000013), ReactionType.FUNNY, LocalDate.of(2023, 6, 2));
        net.getUser("jane_smith").react(net.getPublication(2023000016), ReactionType.ANGRY, LocalDate.of(2023, 7, 2));
        net.getUser("jane_smith").react(net.getPublication(2024000001), ReactionType.LOVE, LocalDate.of(2023, 8, 2));
        net.getUser("jane_smith").react(net.getPublication(2023000009), ReactionType.LOVE, LocalDate.of(2023, 9, 2));
        net.getUser("jane_smith").react(net.getPublication(2025000007), ReactionType.LIKE, LocalDate.of(2023, 10, 2));
        net.getUser("jane_smith").react(net.getPublication(2024000017), ReactionType.FUNNY, LocalDate.of(2023, 11, 2));
        net.getUser("jane_smith").react(net.getPublication(2023000005), ReactionType.LIKE, LocalDate.of(2023, 12, 2));
        net.getUser("jane_smith").react(net.getPublication(2024000010), ReactionType.LOVE, LocalDate.of(2024, 1, 2));

        // Bob Jones reactions
        net.getUser("bob_jones").react(net.getPublication(2023000018), ReactionType.FUNNY, LocalDate.of(2023, 2, 3));
        net.getUser("bob_jones").react(net.getPublication(2024000005), ReactionType.FUNNY, LocalDate.of(2023, 3, 3));
        net.getUser("bob_jones").react(net.getPublication(2023000011), ReactionType.FUNNY, LocalDate.of(2023, 4, 3));
        net.getUser("bob_jones").react(net.getPublication(2024000014), ReactionType.LIKE, LocalDate.of(2023, 5, 3));
        net.getUser("bob_jones").react(net.getPublication(2025000001), ReactionType.FUNNY, LocalDate.of(2023, 6, 3));

        // Alice Williams reactions
        net.getUser("alice_williams").react(net.getPublication(2023000004), ReactionType.ANGRY, LocalDate.of(2023, 2, 4));
        net.getUser("alice_williams").react(net.getPublication(2024000012), ReactionType.ANGRY, LocalDate.of(2023, 3, 4));
        net.getUser("alice_williams").react(net.getPublication(2023000015), ReactionType.LOVE, LocalDate.of(2023, 4, 4));
        net.getUser("alice_williams").react(net.getPublication(2026000001), ReactionType.ANGRY, LocalDate.of(2023, 5, 4));
        net.getUser("alice_williams").react(net.getPublication(2024000007), ReactionType.ANGRY, LocalDate.of(2023, 6, 4));
        net.getUser("alice_williams").react(net.getPublication(2023000010), ReactionType.LOVE, LocalDate.of(2023, 7, 4));
        net.getUser("alice_williams").react(net.getPublication(2025000005), ReactionType.ANGRY, LocalDate.of(2023, 8, 4));
        net.getUser("alice_williams").react(net.getPublication(2024000002), ReactionType.LOVE, LocalDate.of(2023, 9, 4));

        // Dave Clark reactions
        net.getUser("dave_clark").react(net.getPublication(2023000013), ReactionType.LIKE, LocalDate.of(2023, 2, 5));
        net.getUser("dave_clark").react(net.getPublication(2024000009), ReactionType.LIKE, LocalDate.of(2023, 3, 5));
        net.getUser("dave_clark").react(net.getPublication(2023000006), ReactionType.LIKE, LocalDate.of(2023, 4, 5));

        // Eve Miller reactions
        net.getUser("eve_miller").react(net.getPublication(2024000015), ReactionType.LOVE, LocalDate.of(2023, 2, 6));
        net.getUser("eve_miller").react(net.getPublication(2023000002), ReactionType.ANGRY, LocalDate.of(2023, 3, 6));
        net.getUser("eve_miller").react(net.getPublication(2025000002), ReactionType.LOVE, LocalDate.of(2023, 4, 6));
        net.getUser("eve_miller").react(net.getPublication(2024000006), ReactionType.LOVE, LocalDate.of(2023, 5, 6));
        net.getUser("eve_miller").react(net.getPublication(2023000008), ReactionType.FUNNY, LocalDate.of(2023, 6, 6));
        net.getUser("eve_miller").react(net.getPublication(2024000004), ReactionType.LOVE, LocalDate.of(2023, 7, 6));
        net.getUser("eve_miller").react(net.getPublication(2023000001), ReactionType.LOVE, LocalDate.of(2023, 8, 6));
        net.getUser("eve_miller").react(net.getPublication(2025000006), ReactionType.ANGRY, LocalDate.of(2023, 9, 6));
        net.getUser("eve_miller").react(net.getPublication(2024000011), ReactionType.LOVE, LocalDate.of(2023, 10, 6));
        net.getUser("eve_miller").react(net.getPublication(2023000017), ReactionType.FUNNY, LocalDate.of(2023, 11, 6));

        // Frank Wilson reactions
        net.getUser("frank_wilson").react(net.getPublication(2023000016), ReactionType.LIKE, LocalDate.of(2023, 2, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000003), ReactionType.LIKE, LocalDate.of(2023, 3, 7));
        net.getUser("frank_wilson").react(net.getPublication(2025000004), ReactionType.ANGRY, LocalDate.of(2023, 4, 7));
        net.getUser("frank_wilson").react(net.getPublication(2023000012), ReactionType.LIKE, LocalDate.of(2023, 5, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000016), ReactionType.FUNNY, LocalDate.of(2023, 6, 7));
        net.getUser("frank_wilson").react(net.getPublication(2023000009), ReactionType.LIKE, LocalDate.of(2023, 7, 7));
        net.getUser("frank_wilson").react(net.getPublication(2025000007), ReactionType.LIKE, LocalDate.of(2023, 8, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000013), ReactionType.FUNNY, LocalDate.of(2023, 9, 7));
        net.getUser("frank_wilson").react(net.getPublication(2023000018), ReactionType.ANGRY, LocalDate.of(2023, 10, 7));
        net.getUser("frank_wilson").react(net.getPublication(2026000002), ReactionType.LIKE, LocalDate.of(2023, 11, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000017), ReactionType.ANGRY, LocalDate.of(2023, 12, 7));
        net.getUser("frank_wilson").react(net.getPublication(2023000005), ReactionType.FUNNY, LocalDate.of(2024, 1, 7));
        net.getUser("frank_wilson").react(net.getPublication(2025000003), ReactionType.LIKE, LocalDate.of(2024, 2, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000008), ReactionType.ANGRY, LocalDate.of(2024, 3, 7));
        net.getUser("frank_wilson").react(net.getPublication(2023000014), ReactionType.FUNNY, LocalDate.of(2024, 4, 7));
        net.getUser("frank_wilson").react(net.getPublication(2024000015), ReactionType.LIKE, LocalDate.of(2024, 5, 7));

        // Grace Lee reactions
        net.getUser("grace_lee").react(net.getPublication(2023000007), ReactionType.FUNNY, LocalDate.of(2023, 2, 7));
        net.getUser("grace_lee").react(net.getPublication(2025000005), ReactionType.ANGRY, LocalDate.of(2023, 3, 7));
        
        // Make comments on publications
        // John Doe comments
        net.getUser("john_doe").comment(net.getPublication(2023000002), "The lighting in this shot is absolutely perfect!", LocalDate.of(2023, 4, 10));
        net.getUser("john_doe").comment(net.getPublication(2023000006), "Charlie really nailed the pacing on this video.", LocalDate.of(2023, 9, 5));
        net.getUser("john_doe").comment(net.getPublication(2024000003), "Jane's text posts always hit different.", LocalDate.of(2024, 10, 8));
        net.getUser("john_doe").comment(net.getPublication(2025000003), "Eve's photography keeps getting better and better.", LocalDate.of(2025, 4, 20));
        net.getUser("john_doe").comment(net.getPublication(2023000010), "This post really made me reflect, great stuff.", LocalDate.of(2023, 12, 14));

        // Jane Smith comments
        net.getUser("jane_smith").comment(net.getPublication(2023000005), "Charlie's images have such a unique style!", LocalDate.of(2024, 7, 1));
        net.getUser("jane_smith").comment(net.getPublication(2024000006), "Dave always writes the most thought-provoking posts.", LocalDate.of(2024, 7, 20));
        net.getUser("jane_smith").comment(net.getPublication(2024000002), "Really proud of how this video turned out!", LocalDate.of(2024, 9, 5));
        net.getUser("jane_smith").comment(net.getPublication(2025000004), "The composition in this photo is breathtaking.", LocalDate.of(2025, 5, 10));
        net.getUser("jane_smith").comment(net.getPublication(2024000015), "Henry's posts are always so well written.", LocalDate.of(2024, 11, 8));
        net.getUser("jane_smith").comment(net.getPublication(2023000008), "This video aged so well, still love watching it.", LocalDate.of(2024, 10, 3));
        net.getUser("jane_smith").comment(net.getPublication(2025000006), "Eve captures light like no one else.", LocalDate.of(2025, 7, 15));
        net.getUser("jane_smith").comment(net.getPublication(2024000011), "Dave's sixth post is honestly his best yet.", LocalDate.of(2024, 8, 1));
        net.getUser("jane_smith").comment(net.getPublication(2026000002), "Alice's writing style is so refreshing.", LocalDate.of(2026, 6, 1));
        net.getUser("jane_smith").comment(net.getPublication(2023000017), "Grace's text posts are always so relatable.", LocalDate.of(2024, 7, 5));

        // Bob Jones comments
        net.getUser("bob_jones").comment(net.getPublication(2023000003), "John's images always have such great depth.", LocalDate.of(2026, 1, 10));
        net.getUser("bob_jones").comment(net.getPublication(2024000010), "Dave writes with such clarity, love this post.", LocalDate.of(2026, 2, 5));
        net.getUser("bob_jones").comment(net.getPublication(2025000005), "Eve's fourth image might be my favorite of hers.", LocalDate.of(2026, 1, 20));
        net.getUser("bob_jones").comment(net.getPublication(2026000001), "Alice's photography is genuinely stunning.", LocalDate.of(2026, 4, 15));
        net.getUser("bob_jones").comment(net.getPublication(2024000017), "Henry always ends his series on a high note.", LocalDate.of(2026, 3, 1));
        net.getUser("bob_jones").comment(net.getPublication(2023000011), "Charlie's second text post still holds up perfectly.", LocalDate.of(2026, 2, 20));
        net.getUser("bob_jones").comment(net.getPublication(2025000007), "This video is seriously impressive, great work Eve.", LocalDate.of(2026, 1, 5));

        // Alice Williams comments
        net.getUser("alice_williams").comment(net.getPublication(2023000001), "John's first image is still one of my favorites.", LocalDate.of(2026, 4, 10));
        net.getUser("alice_williams").comment(net.getPublication(2025000002), "Eve's photography series is absolutely stunning.", LocalDate.of(2026, 4, 25));
        net.getUser("alice_williams").comment(net.getPublication(2024000014), "Henry's third video is so well paced.", LocalDate.of(2026, 5, 5));
        net.getUser("alice_williams").comment(net.getPublication(2026000001), "So happy with how this image came out!", LocalDate.of(2026, 4, 5));
        net.getUser("alice_williams").comment(net.getPublication(2023000018), "Grace's writing always feels so genuine.", LocalDate.of(2026, 5, 20));
        net.getUser("alice_williams").comment(net.getPublication(2025000007), "This is one of the best videos on this platform.", LocalDate.of(2026, 6, 1));

        // Dave Clark comments
        net.getUser("dave_clark").comment(net.getPublication(2023000004), "John's video work is seriously underrated.", LocalDate.of(2024, 10, 5));
        net.getUser("dave_clark").comment(net.getPublication(2024000006), "Rereading my own post and still stand by every word.", LocalDate.of(2024, 10, 20));
        net.getUser("dave_clark").comment(net.getPublication(2025000002), "The lighting in this photo is simply gorgeous.", LocalDate.of(2025, 3, 10));
        net.getUser("dave_clark").comment(net.getPublication(2024000001), "Jane's photography has such a clean aesthetic.", LocalDate.of(2024, 11, 1));
        net.getUser("dave_clark").comment(net.getPublication(2023000013), "Grace's first video is still so impressive.", LocalDate.of(2024, 9, 25));
        net.getUser("dave_clark").comment(net.getPublication(2025000001), "Bob's debut video was better than expected!", LocalDate.of(2025, 2, 5));
        net.getUser("dave_clark").comment(net.getPublication(2025000006), "Eve captures moods with her photos like no one else.", LocalDate.of(2025, 8, 1));
        net.getUser("dave_clark").comment(net.getPublication(2024000012), "Henry's first video set the bar really high.", LocalDate.of(2024, 11, 15));
        net.getUser("dave_clark").comment(net.getPublication(2026000002), "Alice's writing is so honest and engaging.", LocalDate.of(2026, 5, 10));
        net.getUser("dave_clark").comment(net.getPublication(2023000010), "Charlie's text posts always make me think twice.", LocalDate.of(2024, 10, 12));

        // Eve Miller comments
        net.getUser("eve_miller").comment(net.getPublication(2023000002), "John's second image is such a classic shot.", LocalDate.of(2025, 8, 3));
        net.getUser("eve_miller").comment(net.getPublication(2024000004), "Jane's text posts are always so on point.", LocalDate.of(2025, 7, 20));
        net.getUser("eve_miller").comment(net.getPublication(2025000001), "Bob's video quality is seriously impressive.", LocalDate.of(2025, 8, 15));
        net.getUser("eve_miller").comment(net.getPublication(2025000005), "Took this shot during the best afternoon light.", LocalDate.of(2025, 9, 1));
        net.getUser("eve_miller").comment(net.getPublication(2024000016), "Henry writes with such a natural flow.", LocalDate.of(2025, 7, 25));
        net.getUser("eve_miller").comment(net.getPublication(2023000016), "Grace's video series is one of the best on here.", LocalDate.of(2025, 10, 5));
        net.getUser("eve_miller").comment(net.getPublication(2026000001), "Alice's first image is already iconic.", LocalDate.of(2026, 4, 20));
        net.getUser("eve_miller").comment(net.getPublication(2024000009), "Dave always writes with such conviction.", LocalDate.of(2025, 8, 25));
        net.getUser("eve_miller").comment(net.getPublication(2025000007), "Filming this was such a fun experience!", LocalDate.of(2025, 9, 10));
        net.getUser("eve_miller").comment(net.getPublication(2023000007), "Charlie's second video is still one of my favorites.", LocalDate.of(2025, 11, 1));
        net.getUser("eve_miller").comment(net.getPublication(2025000003), "Really happy with the depth in this shot.", LocalDate.of(2025, 10, 20));

        // Frank Wilson comments
        net.getUser("frank_wilson").comment(net.getPublication(2024000007), "Dave's second post is genuinely brilliant.", LocalDate.of(2026, 4, 5));
        net.getUser("frank_wilson").comment(net.getPublication(2025000002), "Eve's photography series is world class.", LocalDate.of(2026, 4, 20));

        // Grace Lee comments
        net.getUser("grace_lee").comment(net.getPublication(2023000001), "John's debut image is still stunning.", LocalDate.of(2023, 3, 10));
        net.getUser("grace_lee").comment(net.getPublication(2023000006), "Charlie's first video has such great energy.", LocalDate.of(2023, 8, 5));
        net.getUser("grace_lee").comment(net.getPublication(2024000002), "Jane's video is so well edited, loved it.", LocalDate.of(2024, 9, 1));
        net.getUser("grace_lee").comment(net.getPublication(2025000001), "Bob's first video was such a pleasant surprise.", LocalDate.of(2025, 2, 15));
        net.getUser("grace_lee").comment(net.getPublication(2024000011), "Dave's sixth post is honestly his most insightful.", LocalDate.of(2024, 7, 5));
        net.getUser("grace_lee").comment(net.getPublication(2025000005), "Eve's fourth image is the best of the series.", LocalDate.of(2025, 6, 20));
        net.getUser("grace_lee").comment(net.getPublication(2023000013), "Really proud of how this video came together.", LocalDate.of(2024, 2, 1));
        
        // Henry Taylor comments
        net.getUser("henry_taylor").comment(net.getPublication(2023000004), "John's video work is so clean and well edited.", LocalDate.of(2025, 1, 10));
        net.getUser("henry_taylor").comment(net.getPublication(2025000002), "Eve's first image of the series sets the tone perfectly.", LocalDate.of(2025, 3, 5));
        net.getUser("henry_taylor").comment(net.getPublication(2024000005), "Jane's third text post is incredibly well written.", LocalDate.of(2025, 1, 20));
        net.getUser("henry_taylor").comment(net.getPublication(2025000006), "The mood Eve captured in this photo is unreal.", LocalDate.of(2025, 7, 5));
        net.getUser("henry_taylor").comment(net.getPublication(2026000002), "Alice's writing is so genuine and engaging.", LocalDate.of(2026, 5, 10));
        net.getUser("henry_taylor").comment(net.getPublication(2023000018), "Grace's second text post is still so relevant.", LocalDate.of(2025, 2, 1));
        net.getUser("henry_taylor").comment(net.getPublication(2025000007), "Eve's video is a masterpiece, seriously impressive.", LocalDate.of(2025, 8, 20));
        net.getUser("henry_taylor").comment(net.getPublication(2024000012), "Really happy with how my first video came out!", LocalDate.of(2025, 1, 5));
        net.getUser("henry_taylor").comment(net.getPublication(2025000001), "Bob's debut video did not disappoint at all.", LocalDate.of(2025, 2, 15));
        net.getUser("henry_taylor").comment(net.getPublication(2023000009), "Charlie's fourth video is still peak content.", LocalDate.of(2025, 3, 20));
        net.getUser("henry_taylor").comment(net.getPublication(2024000016), "Henry's second text post - still proud of this one.", LocalDate.of(2025, 1, 15));
    
        // Make comments on comments (responses)
        // John Doe responses
        net.getUser("john_doe").comment(net.getUser("grace_lee").getComment(0), "Thank you Grace, means a lot!", LocalDate.of(2023, 4, 5));
        net.getUser("john_doe").comment(net.getUser("henry_taylor").getComment(0), "Glad you enjoyed it Henry!", LocalDate.of(2025, 2, 1));
        net.getUser("john_doe").comment(net.getUser("eve_miller").getComment(0), "Always love hearing your thoughts Eve!", LocalDate.of(2025, 9, 10));
        net.getUser("john_doe").comment(net.getUser("frank_wilson").getComment(1), "Eve's work really is something else!", LocalDate.of(2026, 5, 1));

        // Jane Smith responses
        net.getUser("jane_smith").comment(net.getUser("dave_clark").getComment(3), "Really appreciate that Dave, thank you!", LocalDate.of(2024, 11, 10));
        net.getUser("jane_smith").comment(net.getUser("eve_miller").getComment(1), "So happy you enjoy my posts Eve!", LocalDate.of(2025, 8, 1));
        net.getUser("jane_smith").comment(net.getUser("henry_taylor").getComment(2), "That really means a lot, thank you Henry!", LocalDate.of(2025, 2, 5));

        // Bob Jones responses
        net.getUser("bob_jones").comment(net.getUser("grace_lee").getComment(3), "Bob's video was a labor of love, glad it shows!", LocalDate.of(2026, 1, 10));
        net.getUser("bob_jones").comment(net.getUser("dave_clark").getComment(5), "Thanks Dave, really appreciate the kind words!", LocalDate.of(2026, 2, 10));
        net.getUser("bob_jones").comment(net.getUser("henry_taylor").getComment(8), "That comment made my day, thank you!", LocalDate.of(2026, 3, 1));

        // Alice Williams responses
        net.getUser("alice_williams").comment(net.getUser("bob_jones").getComment(3), "Thank you so much, really means a lot!", LocalDate.of(2026, 5, 1));
        net.getUser("alice_williams").comment(net.getUser("eve_miller").getComment(6), "So glad you think so Eve, more coming soon!", LocalDate.of(2026, 5, 10));
        net.getUser("alice_williams").comment(net.getUser("frank_wilson").getComment(0), "That is so kind, thank you Frank!", LocalDate.of(2026, 4, 10));

        // Dave Clark responses
        net.getUser("dave_clark").comment(net.getUser("jane_smith").getComment(1), "Glad it resonated with you Jane!", LocalDate.of(2024, 8, 1));
        net.getUser("dave_clark").comment(net.getUser("grace_lee").getComment(4), "Always appreciate your feedback Grace!", LocalDate.of(2024, 8, 10));
        net.getUser("dave_clark").comment(net.getUser("john_doe").getComment(4), "Charlie's posts really do make you think!", LocalDate.of(2024, 1, 1));
        net.getUser("dave_clark").comment(net.getUser("eve_miller").getComment(7), "Conviction is the only way to write!", LocalDate.of(2025, 9, 5));

        // Eve Miller responses
        net.getUser("eve_miller").comment(net.getUser("john_doe").getComment(3), "Thank you so much John, that means everything!", LocalDate.of(2025, 5, 1));
        net.getUser("eve_miller").comment(net.getUser("jane_smith").getComment(6), "Light is everything in photography!", LocalDate.of(2025, 8, 1));
        net.getUser("eve_miller").comment(net.getUser("dave_clark").getComment(6), "Really appreciate that Dave!", LocalDate.of(2025, 8, 10));
        net.getUser("eve_miller").comment(net.getUser("henry_taylor").getComment(1), "So glad the series is connecting with people!", LocalDate.of(2025, 3, 20));
        net.getUser("eve_miller").comment(net.getUser("frank_wilson").getComment(1), "World class is a big compliment, thank you Frank!", LocalDate.of(2026, 5, 1));

        // Frank Wilson responses
        net.getUser("frank_wilson").comment(net.getUser("alice_williams").getComment(3), "Your image really is stunning Alice!", LocalDate.of(2026, 4, 20));
        net.getUser("frank_wilson").comment(net.getUser("bob_jones").getComment(3), "Alice's photography is truly on another level!", LocalDate.of(2026, 5, 5));
        net.getUser("frank_wilson").comment(net.getUser("eve_miller").getComment(6), "Already iconic is not an exaggeration!", LocalDate.of(2026, 5, 15));

        // Grace Lee responses
        net.getUser("grace_lee").comment(net.getUser("john_doe").getComment(1), "Charlie's videos really are something special!", LocalDate.of(2023, 10, 1));
        net.getUser("grace_lee").comment(net.getUser("dave_clark").getComment(4), "That video took so much work, glad you noticed!", LocalDate.of(2024, 10, 5));
        net.getUser("grace_lee").comment(net.getUser("henry_taylor").getComment(5), "So happy that post still resonates!", LocalDate.of(2025, 2, 10));
        net.getUser("grace_lee").comment(net.getUser("bob_jones").getComment(5), "That one is still one of my favorites too!", LocalDate.of(2026, 3, 5));

        // Henry Taylor responses
        net.getUser("henry_taylor").comment(net.getUser("dave_clark").getComment(7), "Really appreciate that Dave, first video jitters were real!", LocalDate.of(2025, 1, 1));
        net.getUser("henry_taylor").comment(net.getUser("grace_lee").getComment(2), "Jane's editing really is top notch!", LocalDate.of(2025, 1, 5));
        net.getUser("henry_taylor").comment(net.getUser("jane_smith").getComment(4), "That comment made posting so worth it, thank you!", LocalDate.of(2025, 1, 10));
        net.getUser("henry_taylor").comment(net.getUser("eve_miller").getComment(4), "Natural flow is what I always aim for!", LocalDate.of(2025, 8, 1));
    
        // Execute methods
        net.userSummary();
        net.publicationSummary();
        net.reactionSummary();
        
        Publication publication = net.getPublicationMaxComments();
        System.out.println("Information of publication with the most total comments:");
        System.out.println("- Type: " + publication.getClass().getSimpleName());
        System.out.println("- Author: " + publication.getAuthor().getFullname());
        System.out.println("- Publication date: " + publication.getPublicationDate());
        System.out.println("- Number of reactions: " + publication.getNumReactions());
        System.out.println("- Number of comments: " + publication.getTotalComments());
        System.out.println("");
        
        LocalDate start = LocalDate.of(2024, 6, 1);
        LocalDate end = LocalDate.of(2025, 4, 30);
        System.out.println("The user with most reactions between " + start + " and " + end + " is: " + net.getUserMaxReactions(start, end).getFullname());
    }
    
}

/**
------------- Resultados -------------

User summary:
- John Doe
  - Username: john_doe
  - Email: john.doe@example.com
  - Registration date: 2023-01-01
  - Followers:
    - Grace Lee
  - Following:
    - Jane Smith
    - Bob Jones
  - Number of publications: 4
  - Number of reactions: 9
  - Number of comments: 9
- Jane Smith
  - Username: jane_smith
  - Email: jane.smith@example.com
  - Registration date: 2024-06-15
  - Followers:
    - John Doe
    - Grace Lee
    - Henry Taylor
  - Following:
    - Alice Williams
  - Number of publications: 5
  - Number of reactions: 12
  - Number of comments: 13
- Bob Jones
  - Username: bob_jones
  - Email: bob.jones@example.com
  - Registration date: 2025-12-31
  - Followers:
    - John Doe
    - Henry Taylor
  - Following:
    - Charlie Brown
  - Number of publications: 1
  - Number of reactions: 5
  - Number of comments: 10
- Alice Williams
  - Username: alice_williams
  - Email: alice.williams@example.com
  - Registration date: 2026-03-31
  - Followers:
    - Jane Smith
    - Henry Taylor
  - Following:
    - Dave Clark
  - Number of publications: 2
  - Number of reactions: 8
  - Number of comments: 9
- Charlie Brown
  - Username: charlie_brown
  - Email: charlie.brown@example.com
  - Registration date: 2023-01-01
  - Followers:
    - Bob Jones
    - Henry Taylor
  - Following:
    - Eve Miller
  - Number of publications: 7
  - Number of reactions: 0
  - Number of comments: 0
- Dave Clark
  - Username: dave_clark
  - Email: dave.clark@example.com
  - Registration date: 2024-09-20
  - Followers:
    - Alice Williams
  - Following:
    - Frank Wilson
  - Number of publications: 6
  - Number of reactions: 3
  - Number of comments: 14
- Eve Miller
  - Username: eve_miller
  - Email: eve.miller@example.com
  - Registration date: 2025-07-10
  - Followers:
    - Charlie Brown
  - Following:
    - Grace Lee
  - Number of publications: 6
  - Number of reactions: 10
  - Number of comments: 16
- Frank Wilson
  - Username: frank_wilson
  - Email: frank.wilson@example.com
  - Registration date: 2026-03-31
  - Followers:
    - Dave Clark
  - Following:
    - Henry Taylor
  - Number of publications: 0
  - Number of reactions: 16
  - Number of comments: 5
- Grace Lee
  - Username: grace_lee
  - Email: grace.lee@example.com
  - Registration date: 2023-01-01
  - Followers:
    - Eve Miller
  - Following:
    - John Doe
    - Jane Smith
  - Number of publications: 7
  - Number of reactions: 2
  - Number of comments: 11
- Henry Taylor
  - Username: henry_taylor
  - Email: henry.taylor@example.com
  - Registration date: 2024-12-31
  - Followers:
    - Frank Wilson
  - Following:
    - Jane Smith
    - Bob Jones
    - Alice Williams
    - Charlie Brown
  - Number of publications: 6
  - Number of reactions: 0
  - Number of comments: 15

Publication summary:
- Image published by John Doe at 2023-02-01
  - Reactions:
    - LOVE by Eve Miller at 2023-08-06
  - Comments:
    - Alice Williams commented "John's first image is still one of my favorites." at 2026-04-10
    - Grace Lee commented "John's debut image is still stunning." at 2023-03-10
      - John Doe commented "Thank you Grace, means a lot!" at 2023-04-05
- Image published by John Doe at 2023-03-01
  - Reactions:
    - ANGRY by Eve Miller at 2023-03-06
  - Comments:
    - John Doe commented "The lighting in this shot is absolutely perfect!" at 2023-04-10
    - Eve Miller commented "John's second image is such a classic shot." at 2025-08-03
      - John Doe commented "Always love hearing your thoughts Eve!" at 2025-09-10
- Image published by John Doe at 2023-04-01
  - Reactions:
    - ANGRY by Jane Smith at 2023-04-02
  - Comments:
    - Bob Jones commented "John's images always have such great depth." at 2026-01-10
- Video published by John Doe at 2023-05-01
  - Reactions:
    - ANGRY by Alice Williams at 2023-02-04
  - Comments:
    - Dave Clark commented "John's video work is seriously underrated." at 2024-10-05
    - Henry Taylor commented "John's video work is so clean and well edited." at 2025-01-10
      - John Doe commented "Glad you enjoyed it Henry!" at 2025-02-01
- Image published by Jane Smith at 2024-07-01
  - Reactions:
    - LOVE by Jane Smith at 2023-08-02
  - Comments:
    - Dave Clark commented "Jane's photography has such a clean aesthetic." at 2024-11-01
      - Jane Smith commented "Really appreciate that Dave, thank you!" at 2024-11-10
- Video published by Jane Smith at 2024-08-01
  - Reactions:
    - LOVE by Alice Williams at 2023-09-04
  - Comments:
    - Jane Smith commented "Really proud of how this video turned out!" at 2024-09-05
    - Grace Lee commented "Jane's video is so well edited, loved it." at 2024-09-01
      - Henry Taylor commented "Jane's editing really is top notch!" at 2025-01-05
- Text published by Jane Smith at 2024-09-01
  - Reactions:
    - LOVE by John Doe at 2024-11-02
    - LIKE by Frank Wilson at 2023-03-07
  - Comments:
    - John Doe commented "Jane's text posts always hit different." at 2024-10-08
- Text published by Jane Smith at 2024-10-01
  - Reactions:
    - LOVE by Eve Miller at 2023-07-06
  - Comments:
    - Eve Miller commented "Jane's text posts are always so on point." at 2025-07-20
      - Jane Smith commented "So happy you enjoy my posts Eve!" at 2025-08-01
- Text published by Jane Smith at 2024-11-01
  - Reactions:
    - FUNNY by Bob Jones at 2023-03-03
  - Comments:
    - Henry Taylor commented "Jane's third text post is incredibly well written." at 2025-01-20
      - Jane Smith commented "That really means a lot, thank you Henry!" at 2025-02-05
- Video published by Bob Jones at 2025-01-01
  - Reactions:
    - FUNNY by Bob Jones at 2023-06-03
  - Comments:
    - Dave Clark commented "Bob's debut video was better than expected!" at 2025-02-05
      - Bob Jones commented "Thanks Dave, really appreciate the kind words!" at 2026-02-10
    - Eve Miller commented "Bob's video quality is seriously impressive." at 2025-08-15
    - Grace Lee commented "Bob's first video was such a pleasant surprise." at 2025-02-15
      - Bob Jones commented "Bob's video was a labor of love, glad it shows!" at 2026-01-10
    - Henry Taylor commented "Bob's debut video did not disappoint at all." at 2025-02-15
      - Bob Jones commented "That comment made my day, thank you!" at 2026-03-01
- Image published by Alice Williams at 2026-04-01
  - Reactions:
    - ANGRY by Alice Williams at 2023-05-04
  - Comments:
    - Bob Jones commented "Alice's photography is genuinely stunning." at 2026-04-15
      - Alice Williams commented "Thank you so much, really means a lot!" at 2026-05-01
      - Frank Wilson commented "Alice's photography is truly on another level!" at 2026-05-05
    - Alice Williams commented "So happy with how this image came out!" at 2026-04-05
      - Frank Wilson commented "Your image really is stunning Alice!" at 2026-04-20
    - Eve Miller commented "Alice's first image is already iconic." at 2026-04-20
      - Alice Williams commented "So glad you think so Eve, more coming soon!" at 2026-05-10
      - Frank Wilson commented "Already iconic is not an exaggeration!" at 2026-05-15
- Text published by Alice Williams at 2026-05-01
  - Reactions:
    - LIKE by John Doe at 2026-04-02
    - LIKE by Frank Wilson at 2023-11-07
  - Comments:
    - Jane Smith commented "Alice's writing style is so refreshing." at 2026-06-01
    - Dave Clark commented "Alice's writing is so honest and engaging." at 2026-05-10
    - Henry Taylor commented "Alice's writing is so genuine and engaging." at 2026-05-10
- Image published by Charlie Brown at 2023-06-01
  - Reactions:
    - LIKE by Jane Smith at 2023-12-02
    - FUNNY by Frank Wilson at 2024-01-07
  - Comments:
    - Jane Smith commented "Charlie's images have such a unique style!" at 2024-07-01
- Video published by Charlie Brown at 2023-07-01
  - Reactions:
    - LIKE by Dave Clark at 2023-04-05
  - Comments:
    - John Doe commented "Charlie really nailed the pacing on this video." at 2023-09-05
      - Grace Lee commented "Charlie's videos really are something special!" at 2023-10-01
    - Grace Lee commented "Charlie's first video has such great energy." at 2023-08-05
- Video published by Charlie Brown at 2023-08-01
  - Reactions:
    - LOVE by John Doe at 2024-10-02
    - FUNNY by Grace Lee at 2023-02-07
  - Comments:
    - Eve Miller commented "Charlie's second video is still one of my favorites." at 2025-11-01
- Video published by Charlie Brown at 2023-09-01
  - Reactions:
    - FUNNY by Eve Miller at 2023-06-06
  - Comments:
    - Jane Smith commented "This video aged so well, still love watching it." at 2024-10-03
- Video published by Charlie Brown at 2023-10-01
  - Reactions:
    - LOVE by Jane Smith at 2023-09-02
    - LIKE by Frank Wilson at 2023-07-07
  - Comments:
    - Henry Taylor commented "Charlie's fourth video is still peak content." at 2025-03-20
- Text published by Charlie Brown at 2023-11-01
  - Reactions:
    - LOVE by Alice Williams at 2023-07-04
  - Comments:
    - John Doe commented "This post really made me reflect, great stuff." at 2023-12-14
      - Dave Clark commented "Charlie's posts really do make you think!" at 2024-01-01
    - Dave Clark commented "Charlie's text posts always make me think twice." at 2024-10-12
- Text published by Charlie Brown at 2023-12-01
  - Reactions:
    - FUNNY by Bob Jones at 2023-04-03
  - Comments:
    - Bob Jones commented "Charlie's second text post still holds up perfectly." at 2026-02-20
      - Grace Lee commented "That one is still one of my favorites too!" at 2026-03-05
- Text published by Dave Clark at 2024-01-01
  - Reactions:
    - LOVE by Eve Miller at 2023-05-06
  - Comments:
    - Jane Smith commented "Dave always writes the most thought-provoking posts." at 2024-07-20
      - Dave Clark commented "Glad it resonated with you Jane!" at 2024-08-01
    - Dave Clark commented "Rereading my own post and still stand by every word." at 2024-10-20
- Text published by Dave Clark at 2024-02-01
  - Reactions:
    - ANGRY by Alice Williams at 2023-06-04
  - Comments:
    - Frank Wilson commented "Dave's second post is genuinely brilliant." at 2026-04-05
      - Alice Williams commented "That is so kind, thank you Frank!" at 2026-04-10
- Text published by Dave Clark at 2024-03-01
  - Reactions:
    - LOVE by Jane Smith at 2023-03-02
    - ANGRY by Frank Wilson at 2024-03-07
  - Comments:
- Text published by Dave Clark at 2024-04-01
  - Reactions:
    - LIKE by Dave Clark at 2023-03-05
  - Comments:
    - Eve Miller commented "Dave always writes with such conviction." at 2025-08-25
      - Dave Clark commented "Conviction is the only way to write!" at 2025-09-05
- Text published by Dave Clark at 2024-05-01
  - Reactions:
    - LOVE by Jane Smith at 2024-01-02
  - Comments:
    - Bob Jones commented "Dave writes with such clarity, love this post." at 2026-02-05
- Text published by Dave Clark at 2024-06-01
  - Reactions:
    - ANGRY by John Doe at 2024-07-02
    - LOVE by Eve Miller at 2023-10-06
  - Comments:
    - Jane Smith commented "Dave's sixth post is honestly his best yet." at 2024-08-01
    - Grace Lee commented "Dave's sixth post is honestly his most insightful." at 2024-07-05
      - Dave Clark commented "Always appreciate your feedback Grace!" at 2024-08-10
- Image published by Eve Miller at 2025-02-01
  - Reactions:
    - LOVE by Eve Miller at 2023-04-06
  - Comments:
    - Alice Williams commented "Eve's photography series is absolutely stunning." at 2026-04-25
    - Dave Clark commented "The lighting in this photo is simply gorgeous." at 2025-03-10
    - Frank Wilson commented "Eve's photography series is world class." at 2026-04-20
      - John Doe commented "Eve's work really is something else!" at 2026-05-01
      - Eve Miller commented "World class is a big compliment, thank you Frank!" at 2026-05-01
    - Henry Taylor commented "Eve's first image of the series sets the tone perfectly." at 2025-03-05
      - Eve Miller commented "So glad the series is connecting with people!" at 2025-03-20
- Image published by Eve Miller at 2025-03-01
  - Reactions:
    - LIKE by Jane Smith at 2023-05-02
    - LIKE by Frank Wilson at 2024-02-07
  - Comments:
    - John Doe commented "Eve's photography keeps getting better and better." at 2025-04-20
      - Eve Miller commented "Thank you so much John, that means everything!" at 2025-05-01
    - Eve Miller commented "Really happy with the depth in this shot." at 2025-10-20
- Image published by Eve Miller at 2025-04-01
  - Reactions:
    - LIKE by John Doe at 2024-09-02
    - ANGRY by Frank Wilson at 2023-04-07
  - Comments:
    - Jane Smith commented "The composition in this photo is breathtaking." at 2025-05-10
- Image published by Eve Miller at 2025-05-01
  - Reactions:
    - ANGRY by Alice Williams at 2023-08-04
    - ANGRY by Grace Lee at 2023-03-07
  - Comments:
    - Bob Jones commented "Eve's fourth image might be my favorite of hers." at 2026-01-20
    - Eve Miller commented "Took this shot during the best afternoon light." at 2025-09-01
    - Grace Lee commented "Eve's fourth image is the best of the series." at 2025-06-20
- Image published by Eve Miller at 2025-06-01
  - Reactions:
    - ANGRY by John Doe at 2023-06-02
    - ANGRY by Eve Miller at 2023-09-06
  - Comments:
    - Jane Smith commented "Eve captures light like no one else." at 2025-07-15
      - Eve Miller commented "Light is everything in photography!" at 2025-08-01
    - Dave Clark commented "Eve captures moods with her photos like no one else." at 2025-08-01
      - Eve Miller commented "Really appreciate that Dave!" at 2025-08-10
    - Henry Taylor commented "The mood Eve captured in this photo is unreal." at 2025-07-05
- Video published by Eve Miller at 2025-07-01
  - Reactions:
    - LIKE by Jane Smith at 2023-10-02
    - LIKE by Frank Wilson at 2023-08-07
  - Comments:
    - Bob Jones commented "This video is seriously impressive, great work Eve." at 2026-01-05
    - Alice Williams commented "This is one of the best videos on this platform." at 2026-06-01
    - Eve Miller commented "Filming this was such a fun experience!" at 2025-09-10
    - Henry Taylor commented "Eve's video is a masterpiece, seriously impressive." at 2025-08-20
- Image published by Grace Lee at 2023-12-15
  - Reactions:
    - LOVE by Jane Smith at 2023-02-02
    - LIKE by Frank Wilson at 2023-05-07
  - Comments:
- Video published by Grace Lee at 2024-01-15
  - Reactions:
    - LIKE by Dave Clark at 2023-02-05
  - Comments:
    - Dave Clark commented "Grace's first video is still so impressive." at 2024-09-25
      - Grace Lee commented "That video took so much work, glad you noticed!" at 2024-10-05
    - Grace Lee commented "Really proud of how this video came together." at 2024-02-01
- Video published by Grace Lee at 2024-02-15
  - Reactions:
    - ANGRY by John Doe at 2024-08-02
    - FUNNY by Frank Wilson at 2024-04-07
  - Comments:
- Video published by Grace Lee at 2024-03-15
  - Reactions:
    - LOVE by Alice Williams at 2023-04-04
  - Comments:
- Video published by Grace Lee at 2024-04-15
  - Reactions:
    - ANGRY by Jane Smith at 2023-07-02
    - LIKE by Frank Wilson at 2023-02-07
  - Comments:
    - Eve Miller commented "Grace's video series is one of the best on here." at 2025-10-05
- Text published by Grace Lee at 2024-05-15
  - Reactions:
    - FUNNY by John Doe at 2025-01-02
    - FUNNY by Eve Miller at 2023-11-06
  - Comments:
    - Jane Smith commented "Grace's text posts are always so relatable." at 2024-07-05
- Text published by Grace Lee at 2024-06-15
  - Reactions:
    - FUNNY by Bob Jones at 2023-02-03
    - ANGRY by Frank Wilson at 2023-10-07
  - Comments:
    - Alice Williams commented "Grace's writing always feels so genuine." at 2026-05-20
    - Henry Taylor commented "Grace's second text post is still so relevant." at 2025-02-01
      - Grace Lee commented "So happy that post still resonates!" at 2025-02-10
- Video published by Henry Taylor at 2024-07-01
  - Reactions:
    - ANGRY by Alice Williams at 2023-03-04
  - Comments:
    - Dave Clark commented "Henry's first video set the bar really high." at 2024-11-15
      - Henry Taylor commented "Really appreciate that Dave, first video jitters were real!" at 2025-01-01
    - Henry Taylor commented "Really happy with how my first video came out!" at 2025-01-05
- Video published by Henry Taylor at 2024-08-01
  - Reactions:
    - FUNNY by Jane Smith at 2023-06-02
    - FUNNY by Frank Wilson at 2023-09-07
  - Comments:
- Video published by Henry Taylor at 2024-09-01
  - Reactions:
    - LIKE by Bob Jones at 2023-05-03
  - Comments:
    - Alice Williams commented "Henry's third video is so well paced." at 2026-05-05
- Text published by Henry Taylor at 2024-10-01
  - Reactions:
    - LOVE by Eve Miller at 2023-02-06
    - LIKE by Frank Wilson at 2024-05-07
  - Comments:
    - Jane Smith commented "Henry's posts are always so well written." at 2024-11-08
      - Henry Taylor commented "That comment made posting so worth it, thank you!" at 2025-01-10
- Text published by Henry Taylor at 2024-11-01
  - Reactions:
    - FUNNY by John Doe at 2026-05-02
    - FUNNY by Frank Wilson at 2023-06-07
  - Comments:
    - Eve Miller commented "Henry writes with such a natural flow." at 2025-07-25
      - Henry Taylor commented "Natural flow is what I always aim for!" at 2025-08-01
    - Henry Taylor commented "Henry's second text post - still proud of this one." at 2025-01-15
- Text published by Henry Taylor at 2024-12-01
  - Reactions:
    - FUNNY by Jane Smith at 2023-11-02
    - ANGRY by Frank Wilson at 2023-12-07
  - Comments:
    - Bob Jones commented "Henry always ends his series on a high note." at 2026-03-01

Reaction summary:
- LIKE: 17
- LOVE: 16
- FUNNY: 15
- ANGRY: 17

Information of publication with the most total comments:
- Type: Image
- Author: Alice Williams
- Publication date: 2026-04-01
- Number of reactions: 1
- Number of comments: 8

The user with most reactions between 2024-06-01 and 2025-04-30 is: Grace Lee
*/