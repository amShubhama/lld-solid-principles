const UserProfile = ({user}) => {
    const ProfileView = userProfileSelector(user);
    return <ProfileView />
}