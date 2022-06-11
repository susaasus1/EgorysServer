package com.example.egorysserver.controller;

import com.example.egorysserver.DTO.*;
import com.example.egorysserver.entity.*;
import com.example.egorysserver.repo.VideoRepo;
import com.example.egorysserver.service.UserInfoService;
import com.example.egorysserver.service.UserService;
import com.example.egorysserver.service.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    VideoService videoService;
    @Autowired
    TextPostService textPostService;
    @Autowired
    ContentTagService contentTagService;
    @Autowired
    ContentInteractionService contentInteractionService;
    @Autowired
    ContentService contentService;
    @Autowired
    AuthorService authorService;
    @Autowired
    ReactionTypeService reactionTypeService;
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;
    @Autowired
    MusicService musicService;
    @Autowired
    FriendService friendService;
    @Autowired
    UserPlaylistService userPlaylistService;
    @Autowired
    FollowerService followerService;

    @PostMapping
    public



    @RequestMapping(value = "/getUserTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<UserDTO> getAllUsers() {
        List<User> users = userService.findAll();
        List<UserDTO> onlyUsers = new ArrayList<>();
        for (User i : users) {
            onlyUsers.add(new UserDTO(i.getU_name(), i.getU_surname(), i.getDate_of_birth(), i.getUid(), i.getGender(), i.getUserInfo().getInfo_id()));
        }
        return onlyUsers;
    }

    @RequestMapping(value = "/getUserInfoTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllUserInfo() {
        List<UserInfo> userInfos = userInfoService.findAll();
        return ResponseEntity.ok().body(userInfos);
    }

    @RequestMapping(value = "/getMusicTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllMusic() {
        List<Music> userInfos = musicService.findAll();
        return ResponseEntity.ok().body(userInfos);
    }

    @RequestMapping(value = "/getFriendsTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<FriendDto> getAllFriends() {
        List<Friend> userInfos = friendService.findAll();
        List<FriendDto> onlyFriends = new ArrayList<>();
        for (Friend i : userInfos) {
            onlyFriends.add(new FriendDto(i.getId().getUid(), i.getId().getUidFriend()));
        }
        return onlyFriends;
    }

    @RequestMapping(value = "/getUserPlaylistTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<UserPlaylistDTO> getAllPlaylist() {
        List<UserPlaylist> userInfos = userPlaylistService.findAll();
        List<UserPlaylistDTO> onlyPlaylist = new ArrayList<>();
        for (UserPlaylist i : userInfos) {
            onlyPlaylist.add(new UserPlaylistDTO(i.getId().getUid(), i.getId().getMusic_id()));
        }
        return onlyPlaylist;
    }

    @RequestMapping(value = "/getReactionTypeTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllReactionType() {
        List<ReactionType> reactionTypes = reactionTypeService.findAll();
        return ResponseEntity.ok().body(reactionTypes);
    }

    @RequestMapping(value = "/getAuthorTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<AuthorDTO> getAuthors() {
        List<Author> authors = authorService.findAll();
        List<AuthorDTO> authorsOnly = new ArrayList<>();
        for (Author i : authors) {
            authorsOnly.add(new AuthorDTO(i.getAuthor_id(), i.getA_nickname(), i.getUser().getUid()));
        }
        return authorsOnly;
    }

    @RequestMapping(value = "/getFollowerTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<FollowerDTO> getFollowers() {
        List<Follower> followers = followerService.findAll();
        List<FollowerDTO> followersOnly = new ArrayList<>();
        for (Follower i : followers) {
            followersOnly.add(new FollowerDTO(i.getFollowerKey().getUid(), i.getFollowerKey().getAuthor_id()));

        }
        return followersOnly;
    }

    @RequestMapping(value = "/getContentTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<ContentDTO> getContent() {
        List<Content> contents = contentService.findAll();
        List<ContentDTO> contentDTOS = new ArrayList<>();
        for (Content i : contents) {
            contentDTOS.add(new ContentDTO(i.getContent_id(), i.getAuthor().getAuthor_id()));
        }
        return contentDTOS;
    }

    @RequestMapping(value = "/getContentInteractionTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<ContentInteractionDTO> getContentInteraction() {
        List<ContentInteraction> contents = contentInteractionService.findAll();
        List<ContentInteractionDTO> contentDTOS = new ArrayList<>();
        for (ContentInteraction i : contents) {
            contentDTOS.add(new ContentInteractionDTO(i.getContentinteraction_id(), i.getUser().getUid(), i.getContent().getContent_id(), i.getReactionType().getReaction_type_id()));
        }
        return contentDTOS;
    }

    @RequestMapping(value = "/getContentTagTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<ContentTagDTO> getContentTag() {
        List<ContentTag> contents = contentTagService.findAll();
        List<ContentTagDTO> contentDTOS = new ArrayList<>();
        for (ContentTag i : contents) {
            contentDTOS.add(new ContentTagDTO(i.getTag(), i.getContentTagKey().getContent_id()));
        }
        return contentDTOS;
    }

    @RequestMapping(value = "/getTextPostTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<TextPostDTO> getTextPost() {
        List<TextPost> contents = textPostService.findAll();
        List<TextPostDTO> contentDTOS = new ArrayList<>();
        for (TextPost i : contents) {
            contentDTOS.add(new TextPostDTO(i.getSymbol_number(), i.getText_post_id(), i.getPost_name(), i.getContent().getContent_id()));
        }
        return contentDTOS;
    }
    @RequestMapping(value = "/getVideoTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<VideoDTO> getVideo() {
        List<Video> contents = videoService.findAll();
        List<VideoDTO> contentDTOS = new ArrayList<>();
        for (Video i : contents) {
            contentDTOS.add(new VideoDTO(i.getDuration_minutes(),i.getShort_description(),i.getVideo_id(),i.getGenre(),i.getVideo_name(),i.getContent().getContent_id()));
        }
        return contentDTOS;
    }
}
